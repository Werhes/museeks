package defpackage;

import android.os.Bundle;
import java.util.List;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7243e implements InterfaceC17145e, InterfaceC8524e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11165e f14797e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4748e f14798e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final PlaybackService f14799e;

    public C7243e(C11165e c11165e, PlaybackService playbackService, C4748e c4748e) {
        this.f14797e = c11165e;
        this.f14799e = playbackService;
        this.f14798e = c4748e;
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void Signature(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: abstract */
    public final /* synthetic */ void mo1480abstract(C5298e c5298e) {
    }

    @Override // defpackage.InterfaceC17145e
    public final void ad() {
        PlaybackService playbackService = this.f14799e;
        C4748e c4748e = this.f14798e;
        if (playbackService.loadAd(c4748e)) {
            playbackService.crashlytics(c4748e);
        }
        playbackService.ads(c4748e, false);
    }

    @Override // defpackage.InterfaceC17145e
    public final void adcel() {
        this.f14799e.ads(this.f14798e, false);
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void admob(float f) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void ads(C8256e c8256e) {
    }

    @Override // defpackage.InterfaceC17145e
    public final C13747e advert(C12318e c12318e, C11858e c11858e, Bundle bundle) {
        int i;
        if (c11858e.vip.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            C7479e c7479e = (C7479e) this.f14797e.f22417e.get(this.f14798e);
            if (c7479e != null) {
                c7479e.vip = true;
            }
            i = 0;
        } else {
            i = -6;
        }
        return AbstractC2017e.license(new C9759e(i));
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void amazon(C17750e c17750e) {
    }

    @Override // defpackage.InterfaceC17145e
    public final void applovin() {
        this.f14799e.ads(this.f14798e, false);
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void appmetrica(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: break */
    public final /* synthetic */ void mo1481break(C4194e c4194e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: case */
    public final /* synthetic */ void mo1482case(int i, int i2) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: class */
    public final /* synthetic */ void mo1484class(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void crashlytics(C8256e c8256e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: default */
    public final /* synthetic */ void mo1485default(C5251e c5251e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: extends */
    public final /* synthetic */ void mo1486extends() {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: final */
    public final /* synthetic */ void mo1487final(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void firebase(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: goto */
    public final /* synthetic */ void mo1488goto(C12053e c12053e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: implements */
    public final /* synthetic */ void mo1489implements(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: interface */
    public final /* synthetic */ void mo1491interface(C12053e c12053e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void isPro(C9039e c9039e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void isVip(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void license(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void loadAd(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void metrica(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void mopub(C4491e c4491e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: native */
    public final /* synthetic */ void mo1492native(AbstractC6690e abstractC6690e, int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void premium(C18255e c18255e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void pro(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void purchase(C0101e c0101e, C0101e c0101e2, int i) {
    }

    @Override // defpackage.InterfaceC17145e
    public final C13747e remoteconfig(C12318e c12318e, List list) {
        return AbstractC2017e.license(new C9759e(-6));
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void signatures(int i) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void smaato(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void startapp(C3335e c3335e) {
    }

    @Override // defpackage.InterfaceC8524e
    public final void subs(InterfaceC16843e interfaceC16843e, C3164e c3164e) {
        if (c3164e.ad.ad(4, 5, 14, 0)) {
            this.f14799e.ads(this.f14798e, false);
        }
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void subscription(int i, C1962e c1962e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: this */
    public final /* synthetic */ void mo1499this(long j) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: throw */
    public final /* synthetic */ void mo1500throw(boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: try */
    public final /* synthetic */ void mo1502try(int i, boolean z) {
    }

    @Override // defpackage.InterfaceC8524e
    public final /* synthetic */ void vip(C2351e c2351e) {
    }

    @Override // defpackage.InterfaceC8524e
    /* renamed from: while */
    public final /* synthetic */ void mo1503while(List list) {
    }
}
