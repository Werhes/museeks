package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C10466e implements InterfaceC7898e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ FirebaseMessaging f20653e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20654e;

    public /* synthetic */ C10466e(FirebaseMessaging firebaseMessaging, int i) {
        this.f20654e = i;
        this.f20653e = firebaseMessaging;
    }

    @Override // defpackage.InterfaceC7898e
    public final void license(Object obj) {
        boolean z;
        switch (this.f20654e) {
            case 0:
                C10953e c10953e = (C10953e) obj;
                if (!this.f20653e.appmetrica.smaato() || c10953e.yandex.ad() == null) {
                    return;
                }
                synchronized (c10953e) {
                    z = c10953e.billing;
                }
                if (z) {
                    return;
                }
                c10953e.yandex(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.f20653e;
                C18320e c18320e = (C18320e) obj;
                C5389e c5389e = FirebaseMessaging.mopub;
                firebaseMessaging.getClass();
                if (c18320e != null) {
                    AbstractC0111e.metrica(c18320e.f35976e);
                    firebaseMessaging.appmetrica();
                    return;
                }
                return;
        }
    }
}
