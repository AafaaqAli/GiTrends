package pk.com.aafaq.gitrends.domain.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Item(
    @SerialName("id")
    val id: Int? = null,

    @SerialName("node_id")
    val nodeId: String? = null,

    @SerialName("name")
    val name: String? = null,

    @SerialName("full_name")
    val fullName: String? = null,

    @SerialName("private")
    val private: Boolean? = null,

    @SerialName("owner")
    val owner: Owner? = Owner(),

    @SerialName("html_url")
    val htmlUrl: String? = null,

    @SerialName("description")
    val description: String? = null,

    @SerialName("fork")
    val fork: Boolean? = null,

    @SerialName("url")
    val url: String? = null,

    @SerialName("forks_url")
    val forksUrl: String? = null,

    @SerialName("keys_url")
    val keysUrl: String? = null,

    @SerialName("collaborators_url")
    val collaboratorsUrl: String? = null,

    @SerialName("teams_url")
    val teamsUrl: String? = null,

    @SerialName("hooks_url")
    val hooksUrl: String? = null,

    @SerialName("issue_events_url")
    val issueEventsUrl: String? = null,

    @SerialName("events_url")
    val eventsUrl: String? = null,

    @SerialName("assignees_url")
    val assigneesUrl: String? = null,

    @SerialName("branches_url")
    val branchesUrl: String? = null,

    @SerialName("tags_url")
    val tagsUrl: String? = null,

    @SerialName("blobs_url")
    val blobsUrl: String? = null,

    @SerialName("git_tags_url")
    val gitTagsUrl: String? = null,

    @SerialName("git_refs_url")
    val gitRefsUrl: String? = null,

    @SerialName("trees_url")
    val treesUrl: String? = null,

    @SerialName("statuses_url")
    val statusesUrl: String? = null,

    @SerialName("languages_url")
    val languagesUrl: String? = null,

    @SerialName("stargazers_url")
    val stargazersUrl: String? = null,

    @SerialName("contributors_url")
    val contributorsUrl: String? = null,

    @SerialName("subscribers_url")
    val subscribersUrl: String? = null,

    @SerialName("subscription_url")
    val subscriptionUrl: String? = null,

    @SerialName("commits_url")
    val commitsUrl: String? = null,

    @SerialName("git_commits_url")
    val gitCommitsUrl: String? = null,

    @SerialName("comments_url")
    val commentsUrl: String? = null,

    @SerialName("issue_comment_url")
    val issueCommentUrl: String? = null,

    @SerialName("contents_url")
    val contentsUrl: String? = null,

    @SerialName("compare_url")
    val compareUrl: String? = null,

    @SerialName("merges_url")
    val mergesUrl: String? = null,

    @SerialName("archive_url")
    val archiveUrl: String? = null,

    @SerialName("downloads_url")
    val downloadsUrl: String? = null,

    @SerialName("issues_url")
    val issuesUrl: String? = null,

    @SerialName("pulls_url")
    val pullsUrl: String? = null,

    @SerialName("milestones_url")
    val milestonesUrl: String? = null,

    @SerialName("notifications_url")
    val notificationsUrl: String? = null,

    @SerialName("labels_url")
    val labelsUrl: String? = null,

    @SerialName("releases_url")
    val releasesUrl: String? = null,

    @SerialName("deployments_url")
    val deploymentsUrl: String? = null,

    @SerialName("created_at")
    val createdAt: String? = null,

    @SerialName("updated_at")
    val updatedAt: String? = null,

    @SerialName("pushed_at")
    val pushedAt: String? = null,

    @SerialName("git_url")
    val gitUrl: String? = null,

    @SerialName("ssh_url")
    val sshUrl: String? = null,

    @SerialName("clone_url")
    val cloneUrl: String? = null,

    @SerialName("svn_url")
    val svnUrl: String? = null,

    @SerialName("homepage")
    val homepage: String? = null,

    @SerialName("size")
    val size: Int? = null,

    @SerialName("stargazers_count")
    val stargazersCount: Int? = null,

    @SerialName("watchers_count")
    val watchersCount: Int? = null,

    @SerialName("language")
    val language: String? = null,

    @SerialName("has_issues")
    val hasIssues: Boolean? = null,

    @SerialName("has_projects")
    val hasProjects: Boolean? = null,

    @SerialName("has_downloads")
    val hasDownloads: Boolean? = null,

    @SerialName("has_wiki")
    val hasWiki: Boolean? = null,

    @SerialName("has_pages")
    val hasPages: Boolean? = null,

    @SerialName("has_discussions")
    val hasDiscussions: Boolean? = null,

    @SerialName("forks_count")
    val forksCount: Int? = null,

    @SerialName("mirror_url")
    val mirrorUrl: String? = null,

    @SerialName("archived")
    val archived: Boolean? = null,

    @SerialName("disabled")
    val disabled: Boolean? = null,

    @SerialName("open_issues_count")
    val openIssuesCount: Int? = null,

    @SerialName("license")
    val license: License? = License(),

    @SerialName("allow_forking")
    val allowForking: Boolean? = null,

    @SerialName("is_template")
    val isTemplate: Boolean? = null,

    @SerialName("web_commit_signoff_required")
    val webCommitSignOffRequired: Boolean? = null,

    @SerialName("topics")
    val topics: List<String> = listOf(),

    @SerialName("visibility")
    val visibility: String? = null,

    @SerialName("forks")
    val forks: Int? = null,

    @SerialName("open_issues")
    val openIssues: Int? = null,

    @SerialName("watchers")
    val watchers: Int? = null,

    @SerialName("default_branch")
    val defaultBranch: String? = null,

    @SerialName("score")
    val score: Double? = null
)