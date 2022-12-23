package io.openfeedback.android.viewmodels

import io.openfeedback.OpenFeedbackConfig
import io.openfeedback.android.viewmodels.models.UISessionFeedback
import kotlinx.coroutines.flow.combine

/**
 * A bunch of extensions to get UI models from a openFeedback object
 */
internal suspend fun OpenFeedbackConfig.getUISessionFeedback(
    sessionId: String,
    language: String
) = combine(
    getProject(),
    getUserVotes(sessionId),
    getTotalVotes(sessionId)
) { project, userVotes, totalVotes ->
    return@combine UISessionFeedbackWithColors(
        OpenFeedbackModelHelper.toUISessionFeedback(project, userVotes, totalVotes, language),
        project.chipColors
    )
}

internal data class UISessionFeedbackWithColors(
    val session: UISessionFeedback,
    val colors: List<String>
)
