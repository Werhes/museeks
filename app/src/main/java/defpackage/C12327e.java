package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12327e extends AbstractC16277e implements InterfaceC3741e {
    @Override // defpackage.InterfaceC3741e
    public final void beginAdUnitExposure(String str, long j) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeLong(j);
        m4155e(m4156e, 23);
    }

    @Override // defpackage.InterfaceC3741e
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        AbstractC1757e.vip(m4156e, bundle);
        m4155e(m4156e, 9);
    }

    @Override // defpackage.InterfaceC3741e
    public final void endAdUnitExposure(String str, long j) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeLong(j);
        m4155e(m4156e, 24);
    }

    @Override // defpackage.InterfaceC3741e
    public final void generateEventId(InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 22);
    }

    @Override // defpackage.InterfaceC3741e
    public final void getCachedAppInstanceId(InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 19);
    }

    @Override // defpackage.InterfaceC3741e
    public final void getConditionalUserProperties(String str, String str2, InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 10);
    }

    @Override // defpackage.InterfaceC3741e
    public final void getCurrentScreenClass(InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 17);
    }

    @Override // defpackage.InterfaceC3741e
    public final void getCurrentScreenName(InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 16);
    }

    @Override // defpackage.InterfaceC3741e
    public final void getGmpAppId(InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 21);
    }

    @Override // defpackage.InterfaceC3741e
    public final void getMaxUserProperties(String str, InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 6);
    }

    @Override // defpackage.InterfaceC3741e
    public final void getUserProperties(String str, String str2, boolean z, InterfaceC9026e interfaceC9026e) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        ClassLoader classLoader = AbstractC1757e.ad;
        m4156e.writeInt(z ? 1 : 0);
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4155e(m4156e, 5);
    }

    @Override // defpackage.InterfaceC3741e
    public final void initialize(InterfaceC15751e interfaceC15751e, C8660e c8660e, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC15751e);
        AbstractC1757e.vip(m4156e, c8660e);
        m4156e.writeLong(j);
        m4155e(m4156e, 1);
    }

    @Override // defpackage.InterfaceC3741e
    public final void initializeWithElapsedTime(InterfaceC15751e interfaceC15751e, C8660e c8660e, long j, long j2) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC15751e);
        AbstractC1757e.vip(m4156e, c8660e);
        m4156e.writeLong(j);
        m4156e.writeLong(j2);
        m4155e(m4156e, 60);
    }

    @Override // defpackage.InterfaceC3741e
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel m4156e = m4156e();
        m4156e.writeString(str);
        m4156e.writeString(str2);
        AbstractC1757e.vip(m4156e, bundle);
        m4156e.writeInt(1);
        m4156e.writeInt(1);
        m4156e.writeLong(j);
        m4156e.writeLong(j2);
        m4155e(m4156e, 59);
    }

    @Override // defpackage.InterfaceC3741e
    public final void logHealthData(int i, String str, InterfaceC15751e interfaceC15751e, InterfaceC15751e interfaceC15751e2, InterfaceC15751e interfaceC15751e3) {
        Parcel m4156e = m4156e();
        m4156e.writeInt(5);
        m4156e.writeString("Error with data collection. Data lost.");
        AbstractC1757e.metrica(m4156e, interfaceC15751e);
        AbstractC1757e.metrica(m4156e, interfaceC15751e2);
        AbstractC1757e.metrica(m4156e, interfaceC15751e3);
        m4155e(m4156e, 33);
    }

    @Override // defpackage.InterfaceC3741e
    public final void onActivityCreatedByScionActivityInfo(C4360e c4360e, Bundle bundle, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        AbstractC1757e.vip(m4156e, bundle);
        m4156e.writeLong(j);
        m4155e(m4156e, 53);
    }

    @Override // defpackage.InterfaceC3741e
    public final void onActivityDestroyedByScionActivityInfo(C4360e c4360e, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        m4156e.writeLong(j);
        m4155e(m4156e, 54);
    }

    @Override // defpackage.InterfaceC3741e
    public final void onActivityPausedByScionActivityInfo(C4360e c4360e, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        m4156e.writeLong(j);
        m4155e(m4156e, 55);
    }

    @Override // defpackage.InterfaceC3741e
    public final void onActivityResumedByScionActivityInfo(C4360e c4360e, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        m4156e.writeLong(j);
        m4155e(m4156e, 56);
    }

    @Override // defpackage.InterfaceC3741e
    public final void onActivitySaveInstanceStateByScionActivityInfo(C4360e c4360e, InterfaceC9026e interfaceC9026e, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        AbstractC1757e.metrica(m4156e, interfaceC9026e);
        m4156e.writeLong(j);
        m4155e(m4156e, 57);
    }

    @Override // defpackage.InterfaceC3741e
    public final void onActivityStartedByScionActivityInfo(C4360e c4360e, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        m4156e.writeLong(j);
        m4155e(m4156e, 51);
    }

    @Override // defpackage.InterfaceC3741e
    public final void onActivityStoppedByScionActivityInfo(C4360e c4360e, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        m4156e.writeLong(j);
        m4155e(m4156e, 52);
    }

    @Override // defpackage.InterfaceC3741e
    public final void registerOnMeasurementEventListener(InterfaceC2134e interfaceC2134e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC2134e);
        m4155e(m4156e, 35);
    }

    @Override // defpackage.InterfaceC3741e
    public final void retrieveAndUploadBatches(InterfaceC11904e interfaceC11904e) {
        Parcel m4156e = m4156e();
        AbstractC1757e.metrica(m4156e, interfaceC11904e);
        m4155e(m4156e, 58);
    }

    @Override // defpackage.InterfaceC3741e
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, bundle);
        m4156e.writeLong(j);
        m4155e(m4156e, 8);
    }

    @Override // defpackage.InterfaceC3741e
    public final void setCurrentScreenByScionActivityInfo(C4360e c4360e, String str, String str2, long j) {
        Parcel m4156e = m4156e();
        AbstractC1757e.vip(m4156e, c4360e);
        m4156e.writeString(str);
        m4156e.writeString(str2);
        m4156e.writeLong(j);
        m4155e(m4156e, 50);
    }

    @Override // defpackage.InterfaceC3741e
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.InterfaceC3741e
    public final void setUserProperty(String str, String str2, InterfaceC15751e interfaceC15751e, boolean z, long j) {
        Parcel m4156e = m4156e();
        m4156e.writeString("fcm");
        m4156e.writeString("_ln");
        AbstractC1757e.metrica(m4156e, interfaceC15751e);
        m4156e.writeInt(1);
        m4156e.writeLong(j);
        m4155e(m4156e, 4);
    }
}
