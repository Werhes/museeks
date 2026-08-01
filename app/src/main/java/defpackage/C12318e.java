package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12318e implements InterfaceC16843e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Handler f24699e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC10488e f24700e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f24701e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C4187e f24702e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC17145e f24703e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11501e f24704e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f24705e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final long f24706e;

    public C12318e(Context context, C7543e c7543e, Bundle bundle, InterfaceC17145e interfaceC17145e, Looper looper, C4187e c4187e, C16911e c16911e) {
        C12318e c12318e;
        InterfaceC10488e c4275e;
        AbstractC2301e.amazon(context, "context must not be null");
        AbstractC2301e.amazon(c7543e, "token must not be null");
        AbstractC2803e.advert("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.0] [" + AbstractC9413e.ad + "]");
        this.f24704e = new C11501e();
        this.f24706e = -9223372036854775807L;
        this.f24703e = interfaceC17145e;
        this.f24699e = new Handler(looper);
        this.f24702e = c4187e;
        if (c7543e.ad.crashlytics()) {
            c16911e.getClass();
            c4275e = new C12621e(context, this, c7543e, bundle, looper, c16911e);
            c12318e = this;
        } else {
            c12318e = this;
            c4275e = new C4275e(context, c12318e, c7543e, bundle, looper);
        }
        c12318e.f24700e = c4275e;
        c4275e.mo1568e();
    }

    @Override // defpackage.InterfaceC16843e
    public final void Signature(C4194e c4194e) {
        metrica();
        AbstractC2301e.amazon(c4194e, "playbackParameters must not be null");
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.Signature(c4194e);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setPlaybackParameters().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: abstract */
    public final long mo2061abstract() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1522abstract();
        }
        return -9223372036854775807L;
    }

    public final void ad() {
        AbstractC2301e.subscription(Looper.myLooper() == this.f24699e.getLooper());
        AbstractC2301e.subscription(!this.f24705e);
        this.f24705e = true;
        C4187e c4187e = this.f24702e;
        c4187e.f9224e = true;
        C12318e c12318e = c4187e.f9226e;
        if (c12318e != null) {
            c4187e.smaato(c12318e);
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final void admob(long j) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.admob(j);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final long ads() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.ads();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC16843e
    public final boolean applovin() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() && interfaceC10488e.applovin();
    }

    @Override // defpackage.InterfaceC16843e
    public final int billing() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.billing();
        }
        return 1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: break */
    public final int mo2062break() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1523break();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: case */
    public final void mo2063case() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1524case();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekToPreviousMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: catch */
    public final float mo2064catch() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1525catch();
        }
        return 1.0f;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: class */
    public final void mo2065class(C1962e c1962e, long j) {
        metrica();
        AbstractC2301e.amazon(c1962e, "mediaItems must not be null");
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1526class(c1962e, j);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: continue */
    public final void mo2066continue() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1528continue();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekToPrevious().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: default */
    public final int mo2067default() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1529default();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: else */
    public final void mo2068else(int i) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1530else(i);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring removeMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eَؑۨ */
    public final void mo2069e(int i, int i2, int i3) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1531e(i, i2, i3);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring moveMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚؑ۟ */
    public final Looper mo3030e() {
        return this.f24699e.getLooper();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؑۥؘ */
    public final void mo2070e(int i, List list) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1533e(i, list);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒ٘ؗ */
    public final long mo2071e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1534e();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒٚۨ */
    public final void mo2072e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1535e();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring mute().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒۖۗ */
    public final C9039e mo2074e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() ? interfaceC10488e.mo1537e() : C9039e.license;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒۤۨ */
    public final long mo2075e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1538e();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّؔٞ */
    public final void mo2076e(List list) {
        metrica();
        AbstractC2301e.amazon(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            AbstractC2301e.purchase("items must not contain null, index=%s", list.get(i) != null, i);
        }
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1539e(list);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِؕٛ */
    public final void mo2077e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1540e();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekForward().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘْؖ */
    public final void mo2078e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1541e();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring unmute().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍؖۙ */
    public final boolean mo2079e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1542e();
        }
        return false;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌؖۡ */
    public final void mo2080e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1544e();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekToNextMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؖۡٝ */
    public final boolean mo2081e() {
        metrica();
        AbstractC6690e mo2105e = mo2105e();
        return !mo2105e.Signature() && mo2105e.smaato(mo2115e(), this.f24704e, 0L).ad();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؗۦۣ */
    public final boolean mo3031e() {
        return false;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘؕۥ */
    public final boolean mo2083e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() && interfaceC10488e.mo1545e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘُٔ */
    public final C12053e mo2085e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() ? interfaceC10488e.mo1546e() : C12053e.f24142throw;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘٕۚ */
    public final void mo2086e(boolean z) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1547e(z);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙؖؗ */
    public final int mo2088e() {
        return mo2105e().loadAd();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍؙّ */
    public final C12053e mo2089e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() ? interfaceC10488e.mo1549e() : C12053e.f24142throw;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚؚؓ */
    public final int mo2090e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1551e();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚٜ۠ */
    public final boolean mo2091e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() && interfaceC10488e.mo1552e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚۜؑ */
    public final void mo3032e(C3335e c3335e, boolean z) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1553e(c3335e, z);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eًًؓ */
    public final void mo2092e(int i) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1554e(i);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌؙٞ */
    public final void mo2093e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1556e();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekBack().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌۘۤ */
    public final void mo2094e(int i, long j, List list) {
        metrica();
        AbstractC2301e.amazon(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            AbstractC2301e.purchase("items must not contain null, index=%s", list.get(i2) != null, i2);
        }
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1557e(i, j, list);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍؓۙ */
    public final void mo2095e(int i) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1559e(i);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eَٖٓ */
    public final void mo2096e(C12053e c12053e) {
        metrica();
        AbstractC2301e.amazon(c12053e, "playlistMetadata must not be null");
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1560e(c12053e);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setPlaylistMetadata().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eُٓؓ */
    public final long mo2097e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1561e();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eُؚٕ */
    public final long mo2098e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1562e();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِؗؓ */
    public final int mo2100e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1564e();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙِۡ */
    public final void mo2101e(List list) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1565e(list);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring addMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّّۚ */
    public final void mo2102e(C1962e c1962e) {
        metrica();
        AbstractC2301e.amazon(c1962e, "mediaItems must not be null");
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1566e(c1962e);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّْٝ */
    public final void mo2103e(C1962e c1962e) {
        metrica();
        AbstractC2301e.amazon(c1962e, "mediaItems must not be null");
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1567e(c1962e);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eًْٕ */
    public final C4491e mo2104e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return !interfaceC10488e.mo1580e() ? C4491e.f9732native : interfaceC10488e.mo1569e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eْۢؕ */
    public final AbstractC6690e mo2105e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() ? interfaceC10488e.mo1571e() : AbstractC6690e.ad;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍٓۢ */
    public final int mo2106e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1573e();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِٓۦ */
    public final boolean mo2107e(int i) {
        return firebase().ad(i);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٓٛۢ */
    public final boolean mo2108e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() && interfaceC10488e.mo1575e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٔؖۘ */
    public final void mo2109e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1576e();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekToNext().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌٔٗ */
    public final void mo2110e(int i, C1962e c1962e) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1577e(i, c1962e);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring replaceMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّٔؖ */
    public final void mo2111e(int i) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1578e(i);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّٔؗ */
    public final long mo2112e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1579e();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍٟٔ */
    public final C1962e mo2113e() {
        AbstractC6690e mo2105e = mo2105e();
        if (mo2105e.Signature()) {
            return null;
        }
        return mo2105e.smaato(mo2115e(), this.f24704e, 0L).metrica;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٕؓٝ */
    public final int mo2115e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1581e();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٕٙؗ */
    public final long mo2116e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1582e();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘٖؗ */
    public final void mo2117e(int i, int i2) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1583e(i, i2);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring moveMediaItem().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٖٔۧ */
    public final void mo2118e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1584e();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٟٗۦ */
    public final C18255e mo2119e() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() ? interfaceC10488e.mo1586e() : C18255e.vip;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ٓۜ */
    public final boolean mo2120e() {
        metrica();
        AbstractC6690e mo2105e = mo2105e();
        return !mo2105e.Signature() && mo2105e.smaato(mo2115e(), this.f24704e, 0L).yandex;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ٔ٘ */
    public final void mo2121e(InterfaceC8524e interfaceC8524e) {
        metrica();
        AbstractC2301e.amazon(interfaceC8524e, "listener must not be null");
        this.f24700e.mo1587e(interfaceC8524e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙٟ٘ */
    public final void mo2123e(boolean z) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1588e(z);
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ۡؗ */
    public final boolean mo2124e() {
        metrica();
        AbstractC6690e mo2105e = mo2105e();
        return !mo2105e.Signature() && mo2105e.smaato(mo2115e(), this.f24704e, 0L).startapp;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: final */
    public final void mo2125final() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1590final();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final C5298e firebase() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return !interfaceC10488e.mo1580e() ? C5298e.vip : interfaceC10488e.firebase();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: for */
    public final void mo2126for(float f) {
        metrica();
        AbstractC2301e.yandex(f >= 0.0f && f <= 1.0f, "volume must be between 0 and 1");
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1591for(f);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setVolume().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final long getDuration() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: implements */
    public final C2351e mo2127implements() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() ? interfaceC10488e.mo1592implements() : C2351e.license;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: import */
    public final int mo2128import() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1593import();
        }
        return -1;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: interface */
    public final boolean mo2129interface() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() && interfaceC10488e.mo1595interface();
    }

    @Override // defpackage.InterfaceC16843e
    public final int isPro() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.isPro();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC16843e
    public final C4194e isVip() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() ? interfaceC10488e.isVip() : C4194e.license;
    }

    @Override // defpackage.InterfaceC16843e
    public final void license() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.license();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final void loadAd() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.loadAd();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring pause().");
        }
    }

    public final void metrica() {
        AbstractC2301e.admob("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.f24699e.getLooper());
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: native */
    public final void mo2130native(boolean z) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1596native(z);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setShuffleMode().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: new */
    public final C5251e mo2131new() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return !interfaceC10488e.mo1580e() ? C5251e.appmetrica : interfaceC10488e.mo1597new();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: package */
    public final void mo2132package(int i, int i2) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1598package(i, i2);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final long premium() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.premium();
        }
        return 0L;
    }

    @Override // defpackage.InterfaceC16843e
    public final void pro() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.pro();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: protected */
    public final void mo2133protected(InterfaceC8524e interfaceC8524e) {
        AbstractC2301e.amazon(interfaceC8524e, "listener must not be null");
        this.f24700e.mo1600protected(interfaceC8524e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: public */
    public final C8256e mo2134public() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1601public();
        }
        return null;
    }

    @Override // defpackage.InterfaceC16843e
    public final void purchase(float f) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.purchase(f);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setPlaybackSpeed().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final void release() {
        metrica();
        if (this.f24701e) {
            return;
        }
        AbstractC2803e.advert("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.0] [" + AbstractC9413e.ad + "] [" + AbstractC1418e.vip() + "]");
        this.f24701e = true;
        Handler handler = this.f24699e;
        handler.removeCallbacksAndMessages(null);
        try {
            this.f24700e.release();
        } catch (Exception e) {
            AbstractC2803e.appmetrica("MediaController", "Exception while releasing impl", e);
        }
        if (this.f24705e) {
            AbstractC2301e.subscription(Looper.myLooper() == handler.getLooper());
            this.f24703e.ad();
        } else {
            this.f24705e = true;
            C4187e c4187e = this.f24702e;
            c4187e.getClass();
            c4187e.amazon(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final void signatures(int i) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.signatures(i);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setRepeatMode().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final C3335e smaato() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return !interfaceC10488e.mo1580e() ? C3335e.startapp : interfaceC10488e.smaato();
    }

    @Override // defpackage.InterfaceC16843e
    public final int startapp() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.startapp();
        }
        return 0;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: static */
    public final void mo2135static(int i, int i2, List list) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1603static(i, i2, list);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring replaceMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final void stop() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.stop();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring stop().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: strictfp */
    public final void mo2136strictfp() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1604strictfp();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring decreaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final void subs(int i, long j) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.subs(i, j);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    public final boolean subscription() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        return interfaceC10488e.mo1580e() && interfaceC10488e.subscription();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: super */
    public final void mo2137super(int i, boolean z) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1605super(i, z);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setDeviceMuted().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: synchronized */
    public final void mo2138synchronized(C4491e c4491e) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (!interfaceC10488e.mo1580e()) {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setTrackSelectionParameters().");
        }
        interfaceC10488e.mo1607synchronized(c4491e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: this */
    public final void mo2139this() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1608this();
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring clearMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: throws */
    public final void mo2140throws(int i, int i2) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1609throws(i, i2);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring removeMediaItems().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: transient */
    public final void mo2141transient(int i) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1610transient(i);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring increaseDeviceVolume().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: try */
    public final long mo2142try() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1611try();
        }
        return 0L;
    }

    public final void vip(Runnable runnable) {
        AbstractC9413e.m2565strictfp(this.f24699e, runnable);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: volatile */
    public final void mo2143volatile(SurfaceHolder surfaceHolder) {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            interfaceC10488e.mo1612volatile(surfaceHolder);
        } else {
            AbstractC2803e.smaato("MediaController", "The controller is not connected. Ignoring setVideoSurfaceHolder().");
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: while */
    public final int mo2144while() {
        metrica();
        InterfaceC10488e interfaceC10488e = this.f24700e;
        if (interfaceC10488e.mo1580e()) {
            return interfaceC10488e.mo1613while();
        }
        return 0;
    }
}
