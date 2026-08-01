package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3741e extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC9026e interfaceC9026e);

    void getAppInstanceId(InterfaceC9026e interfaceC9026e);

    void getCachedAppInstanceId(InterfaceC9026e interfaceC9026e);

    void getConditionalUserProperties(String str, String str2, InterfaceC9026e interfaceC9026e);

    void getCurrentScreenClass(InterfaceC9026e interfaceC9026e);

    void getCurrentScreenName(InterfaceC9026e interfaceC9026e);

    void getGmpAppId(InterfaceC9026e interfaceC9026e);

    void getMaxUserProperties(String str, InterfaceC9026e interfaceC9026e);

    void getSessionId(InterfaceC9026e interfaceC9026e);

    void getTestFlag(InterfaceC9026e interfaceC9026e, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC9026e interfaceC9026e);

    void initForTests(Map map);

    void initialize(InterfaceC15751e interfaceC15751e, C8660e c8660e, long j);

    void initializeWithElapsedTime(InterfaceC15751e interfaceC15751e, C8660e c8660e, long j, long j2);

    void isDataCollectionEnabled(InterfaceC9026e interfaceC9026e);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC9026e interfaceC9026e, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, InterfaceC15751e interfaceC15751e, InterfaceC15751e interfaceC15751e2, InterfaceC15751e interfaceC15751e3);

    void onActivityCreated(InterfaceC15751e interfaceC15751e, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(C4360e c4360e, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC15751e interfaceC15751e, long j);

    void onActivityDestroyedByScionActivityInfo(C4360e c4360e, long j);

    void onActivityPaused(InterfaceC15751e interfaceC15751e, long j);

    void onActivityPausedByScionActivityInfo(C4360e c4360e, long j);

    void onActivityResumed(InterfaceC15751e interfaceC15751e, long j);

    void onActivityResumedByScionActivityInfo(C4360e c4360e, long j);

    void onActivitySaveInstanceState(InterfaceC15751e interfaceC15751e, InterfaceC9026e interfaceC9026e, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(C4360e c4360e, InterfaceC9026e interfaceC9026e, long j);

    void onActivityStarted(InterfaceC15751e interfaceC15751e, long j);

    void onActivityStartedByScionActivityInfo(C4360e c4360e, long j);

    void onActivityStopped(InterfaceC15751e interfaceC15751e, long j);

    void onActivityStoppedByScionActivityInfo(C4360e c4360e, long j);

    void performAction(Bundle bundle, InterfaceC9026e interfaceC9026e, long j);

    void registerOnMeasurementEventListener(InterfaceC2134e interfaceC2134e);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(InterfaceC11904e interfaceC11904e);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC15751e interfaceC15751e, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(C4360e c4360e, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC2134e interfaceC2134e);

    void setInstanceIdProvider(InterfaceC1514e interfaceC1514e);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC15751e interfaceC15751e, boolean z, long j);

    void unregisterOnMeasurementEventListener(InterfaceC2134e interfaceC2134e);
}
