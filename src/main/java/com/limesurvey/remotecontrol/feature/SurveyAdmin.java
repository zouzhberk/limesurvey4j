
package com.limesurvey.remotecontrol.feature;

import com.limesurvey.remotecontrol.domain.*;
import com.limesurvey.remotecontrol.internel.JsonRPC;
import com.limesurvey.remotecontrol.options.*;
import retrofit2.http.POST;
import rx.Observable;

import java.util.List;


/**
 * Generated by class com.limesurvey.java.demo.InterfaceGen.
 */
public interface SurveyAdmin {


    /**
     * RPC Routine that launches a newly created survey.<p>
     *
     * @param options
     * @return The result of the activation
     */
    @POST("remotecontrol")
    @JsonRPC("activate_survey")
    public Observable<Object> activateSurvey(
            @retrofit2.http.Body
            ActivateSurveyOptions options);

    /**
     * RPC routine to to initialise the survey's collection of tokens where new participant tokens may be later added.<p>
     *
     * @param options
     * @return Status=>OK when successfull, otherwise the error description
     */
    @POST("remotecontrol")
    @JsonRPC("activate_tokens")
    public Observable<Object> activateTokens(
            @retrofit2.http.Body
            ActivateTokensOptions options);

    /**
     * RPC Routine to add an empty group with minimum details.<p>
     * Used as a placeholder for importing questions.<p>
     * Returns the groupid of the created group.<p>
     *
     * @param options
     * @return The id of the new group - Or status
     */
    @POST("remotecontrol")
    @JsonRPC("add_group")
    public Observable<Integer> addGroup(
            @retrofit2.http.Body
            AddGroupOptions options);

    /**
     * RPC Routine to add a survey language.<p>
     *
     * @param options
     * @return Status=>OK when successfull, otherwise the error description
     */
    @POST("remotecontrol")
    @JsonRPC("add_language")
    public Observable<String> addLanguage(
            @retrofit2.http.Body
            AddLanguageOptions options);

    /**
     * RPC Routine to add a response to the survey responses collection.<p>
     * Returns the id of the inserted survey response<p>
     *
     * @param options
     * @return The response ID
     */
    @POST("remotecontrol")
    @JsonRPC("add_response")
    public Observable<Integer> addResponse(
            @retrofit2.http.Body
            AddResponseOptions options);

    /**
     * RPC Routine to add an empty survey with minimum details.<p>
     * Used as a placeholder for importing groups and/or questions.<p>
     *
     * @param options
     * @return array|string|int
     */
    @POST("remotecontrol")
    @JsonRPC("add_survey")
    public Observable<String> addSurvey(
            @retrofit2.http.Body
            AddSurveyOptions options);

    /**
     * This function import a participant to the LimeSurvey cpd. It stores attributes as well, if they are registered before within ui<p>
     * <p>
     * Call the function with $response = $myJSONRPCClient->cpd_importParticipants( $sessionKey, $aParticipants);<p>
     * <p>
     * [[0] => ["email"=>"dummy-02222@limesurvey.com","firstname"=>"max","lastname"=>"mustermann"]]
     *
     * @param options
     * @return with status
     */
    @POST("remotecontrol")
    @JsonRPC("cpd_importParticipants")
    public Observable<Object> cpdImportparticipants(
            @retrofit2.http.Body
            CpdImportparticipantsOptions options);

    /**
     * RPC Routine to delete a group of a survey .<p>
     * Returns the id of the deleted group.<p>
     *
     * @param options
     * @return The id of the deleted group or status
     */
    @POST("remotecontrol")
    @JsonRPC("delete_group")
    public Observable<Integer> deleteGroup(
            @retrofit2.http.Body
            DeleteGroupOptions options);

    /**
     * RPC Routine to delete a survey language.<p>
     *
     * @param options
     * @return Status=>OK when successfull, otherwise the error description
     */
    @POST("remotecontrol")
    @JsonRPC("delete_language")
    public Observable<Object> deleteLanguage(
            @retrofit2.http.Body
            DeleteLanguageOptions options);

    /**
     * RPC Routine to delete multiple participants of a Survey.<p>
     * Returns the id of the deleted token<p>
     *
     * @param options
     * @return Result of deletion
     */
    @POST("remotecontrol")
    @JsonRPC("delete_participants")
    public Observable<Object> deleteParticipants(
            @retrofit2.http.Body
            DeleteParticipantsOptions options);

    /**
     * RPC Routine to delete a survey.<p>
     *
     * @param options
     * @return Returns Status
     */
    @POST("remotecontrol")
    @JsonRPC("delete_survey")
    public Observable<Object> deleteSurvey(
            @retrofit2.http.Body
            DeleteSurveyOptions options);

    /**
     * RPC Routine to export responses.<p>
     * Returns the requested file as base64 encoded string<p>
     *
     * @param options
     * @return On success: Requested file as base 64-encoded string. On failure array with error information
     */
    @POST("remotecontrol")
    @JsonRPC("export_responses")
    public Observable<String> exportResponses(
            @retrofit2.http.Body
            ExportResponsesOptions options);

    /**
     * RPC Routine to export token response in a survey.<p>
     * Returns the requested file as base64 encoded string<p>
     * <p>
     *
     * @param options
     * @return On success: Requested file as base 64-encoded string. On failure array with error information
     */
    @POST("remotecontrol")
    @JsonRPC("export_responses_by_token")
    public Observable<String> exportResponsesByToken(
            @retrofit2.http.Body
            ExportResponsesByTokenOptions options);

    /**
     * RPC routine to export statistics of a survey to a user.<p>
     * Returns string - base64 encoding of the statistics.<p>
     *
     * @param options
     * @return Base64 encoded string with the statistics file
     */
    @POST("remotecontrol")
    @JsonRPC("export_statistics")
    public Observable<String> exportStatistics(
            @retrofit2.http.Body
            ExportStatisticsOptions options);

    /**
     * RPC Routine to export submission timeline.<p>
     * Returns an array of values (count and period)<p>
     *
     * @param options
     * @return On success: The timeline. On failure array with error information
     */
    @POST("remotecontrol")
    @JsonRPC("export_timeline")
    public Observable<Object> exportTimeline(
            @retrofit2.http.Body
            ExportTimelineOptions options);

    /**
     * RPC Routine to return properties of a group of a survey .<p>
     * Returns array of properties<p>
     *
     * @param options
     * @return The requested values
     */
    @POST("remotecontrol")
    @JsonRPC("get_group_properties")
    public Observable<Object> getGroupProperties(
            @retrofit2.http.Body
            GetGroupPropertiesOptions options);

    /**
     * RPC Routine to get survey language properties.<p>
     *
     * @param options
     * @return The requested values
     */
    @POST("remotecontrol")
    @JsonRPC("get_language_properties")
    public Observable<Object> getLanguageProperties(
            @retrofit2.http.Body
            GetLanguagePropertiesOptions options);

    /**
     * RPC Routine to return settings of a token/participant of a survey .<p>
     *
     * @param options
     * @return The requested values
     */
    @POST("remotecontrol")
    @JsonRPC("get_participant_properties")
    public Observable<Object> getParticipantProperties(
            @retrofit2.http.Body
            GetParticipantPropertiesOptions options);

    /**
     * RPC Routine to return properties of a question of a survey.<p>
     * Returns string<p>
     *
     * @param options
     * @return The requested values
     */
    @POST("remotecontrol")
    @JsonRPC("get_question_properties")
    public Observable<Object> getQuestionProperties(
            @retrofit2.http.Body
            GetQuestionPropertiesOptions options);

    /**
     * RPC Routine to find response IDs given a survey ID and a token.
     *
     * @param options
     * @return
     */
    @POST("remotecontrol")
    @JsonRPC("get_response_ids")
    public Observable<String> getResponseIds(
            @retrofit2.http.Body
            GetResponseIdsOptions options);

    /**
     * RPC routine to create a session key.<p>
     * Using this function you can create a new XML/JSON-RPC session key.<p>
     * This is mandatory for all following LSRC2 function calls.
     *
     * @param options
     * @return string
     */
    @POST("remotecontrol")
    @JsonRPC("get_session_key")
    public Observable<String> getSessionKey(
            @retrofit2.http.Body
            GetSessionKeyOptions options);

    /**
     * RPC Routine to get settings.<p>
     *
     * @param options
     * @return The requested value
     */
    @POST("remotecontrol")
    @JsonRPC("get_site_settings")
    public Observable<String> getSiteSettings(
            @retrofit2.http.Body
            GetSiteSettingsOptions options);

    /**
     * RPC routine to get survey summary, regarding token usage and survey participation.<p>
     * Returns the requested value as string.<p>
     *
     * @param options
     * @return The requested value or an array of all values when $sStatName = 'all'
     */
    @POST("remotecontrol")
    @JsonRPC("get_summary")
    public Observable<SuerveySummaryEntity> getSummary(
            @retrofit2.http.Body
            GetSummaryOptions options);

    /**
     * RPC Routine to get survey properties.<p>
     *
     * @param options
     * @return array
     */
    @POST("remotecontrol")
    @JsonRPC("get_survey_properties")
    public Observable<Object> getSurveyProperties(
            @retrofit2.http.Body
            GetSurveyPropertiesOptions options);

    /**
     * RPC Routine to import a group - imports lsg,csv<p>
     *
     * @param options
     * @return iGroupID - ID of the new group or status
     */
    @POST("remotecontrol")
    @JsonRPC("import_group")
    public Observable<String> importGroup(
            @retrofit2.http.Body
            ImportGroupOptions options);

    /**
     * RPC Routine to import a question - imports lsq,csv.<p>
     *
     * @param options
     * @return iQuestionID - ID of the new question - Or status
     */
    @POST("remotecontrol")
    @JsonRPC("import_question")
    public Observable<String> importQuestion(
            @retrofit2.http.Body
            ImportQuestionOptions options);

    /**
     * RPC Routine to import a survey - imports lss,csv,xls or survey zip archive.<p>
     *
     * @param options
     * @return iSurveyID - ID of the new survey
     */
    @POST("remotecontrol")
    @JsonRPC("import_survey")
    public Observable<String> importSurvey(
            @retrofit2.http.Body
            ImportSurveyOptions options);

    /**
     * RPC Routine to invite participants in a survey<p>
     * Returns array of results of sending<p>
     *
     * @param options
     * @return Result of the action
     */
    @POST("remotecontrol")
    @JsonRPC("invite_participants")
    public Observable<Object> inviteParticipants(
            @retrofit2.http.Body
            InviteParticipantsOptions options);

    /**
     * RPC Routine to return the ids and info of groups belonging to survey .<p>
     * Returns array of ids and info.<p>
     *
     * @param options
     * @return The list of groups
     */
    @POST("remotecontrol")
    @JsonRPC("list_groups")
    public Observable<List<SurveyGroupEntity>> listGroups(
            @retrofit2.http.Body
            ListGroupsOptions options);

    /**
     * RPC Routine to return the ids and info of token/participants of a survey.<p>
     * if $bUnused is true, user will get the list of not completed tokens (token_return functionality).<p>
     * Parameters iStart and ilimit are used to limit the number of results of this call.<p>
     * Parameter aAttributes is an optional array containing more attribute that may be requested<p>
     *
     * @param options
     * @return The list of tokens
     */
    @POST("remotecontrol")
    @JsonRPC("list_participants")
    public Observable<Object> listParticipants(
            @retrofit2.http.Body
            ListParticipantsOptions options);

    /**
     * RPC Routine to return the ids and info of (sub-)questions of a survey/group.<p>
     * Returns array of ids and info.<p>
     *
     * @param options
     * @return The list of questions
     */
    @POST("remotecontrol")
    @JsonRPC("list_questions")
    public Observable<List<QuestionEntity>> listQuestions(
            @retrofit2.http.Body
            ListQuestionsOptions options);

    /**
     * RPC Routine to list the ids and info of surveys belonging to a user.<p>
     * Returns array of ids and info.<p>
     * If user is admin he can get surveys of every user (parameter sUser) or all surveys (sUser=null)<p>
     * Else only the syrveys belonging to the user requesting will be shown.<p>
     *
     * @param options
     * @return The list of surveys
     */
    @POST("remotecontrol")
    @JsonRPC("list_surveys")
    public Observable<List<SurveyEntity>> listSurveys(
            @retrofit2.http.Body
            ListSurveysOptions options);

    /**
     * RPC Routine to list the ids and info of users.<p>
     * Returns array of ids and info.
     *
     * @param options
     * @return The list of users
     */
    @POST("remotecontrol")
    @JsonRPC("list_users")
    public Observable<List<UserEntity>> listUsers(
            @retrofit2.http.Body
            ListUsersOptions options);

    /**
     * RPC Routine to send register mails to participants in a survey<p>
     * Returns array of results of sending<p>
     * <p>
     * $overrideAllConditions = Array();<p>
     * $overrideAllConditions[] = 'tid = 2';<p>
     * $response = $myJSONRPCClient->mail_registered_participants( $sessionKey, $survey_id, $overrideAllConditions );
     *
     * @param options
     * @return Result of the action
     */
    @POST("remotecontrol")
    @JsonRPC("mail_registered_participants")
    public Observable<Object> mailRegisteredParticipants(
            @retrofit2.http.Body
            MailRegisteredParticipantsOptions options);

    /**
     * Closes the RPC session<p>
     *
     * @param options
     * @return string
     */
    @POST("remotecontrol")
    @JsonRPC("release_session_key")
    public Observable<String> releaseSessionKey(
            @retrofit2.http.Body
            ReleaseSessionKeyOptions options);

    /**
     * RPC Routine to send reminder for participants in a survey<p>
     * Returns array of results of sending<p>
     *
     * @param options
     * @return Result of the action
     */
    @POST("remotecontrol")
    @JsonRPC("remind_participants")
    public Observable<Object> remindParticipants(
            @retrofit2.http.Body
            RemindParticipantsOptions options);

    /**
     * RPC Routine to set group properties.<p>
     *
     * @param options
     * @return Of succeeded and failed modifications according to internal validation.
     */
    @POST("remotecontrol")
    @JsonRPC("set_group_properties")
    public Observable<Object> setGroupProperties(
            @retrofit2.http.Body
            SetGroupPropertiesOptions options);

    /**
     * RPC Routine to set survey language properties.<p>
     *
     * @param options
     * @return Status=>OK, when save successful otherwise error text.
     */
    @POST("remotecontrol")
    @JsonRPC("set_language_properties")
    public Observable<Object> setLanguageProperties(
            @retrofit2.http.Body
            SetLanguagePropertiesOptions options);

    /**
     * RPC Routine to set properties of a survey participant/token.<p>
     * Returns array<p>
     *
     * @param options
     * @return Result of the change action
     */
    @POST("remotecontrol")
    @JsonRPC("set_participant_properties")
    public Observable<Object> setParticipantProperties(
            @retrofit2.http.Body
            SetParticipantPropertiesOptions options);

    /**
     * RPC Routine to set question properties.<p>
     *
     * @param options
     * @return Of succeeded and failed modifications according to internal validation.
     */
    @POST("remotecontrol")
    @JsonRPC("set_question_properties")
    public Observable<Object> setQuestionProperties(
            @retrofit2.http.Body
            SetQuestionPropertiesOptions options);

    /**
     * RPC Routine to set survey properties.<p>
     *
     * @param options
     * @return Of succeeded and failed nodifications according to internal validation.
     */
    @POST("remotecontrol")
    @JsonRPC("set_survey_properties")
    public Observable<Object> setSurveyProperties(
            @retrofit2.http.Body
            SetSurveyPropertiesOptions options);

    /**
     * RPC Routine to update a response in a given survey.<p>
     * Routine supports only single response updates.<p>
     * Response to update will be identified either by the response id, or the token if response id is missing.<p>
     * Routine is only applicable for active surveys with alloweditaftercompletion = Y.<p>
     *
     * @param options
     * @return TRUE(bool) on success. errormessage on error
     */
    @POST("remotecontrol")
    @JsonRPC("update_response")
    public Observable<String> updateResponse(
            @retrofit2.http.Body
            UpdateResponseOptions options);

}
