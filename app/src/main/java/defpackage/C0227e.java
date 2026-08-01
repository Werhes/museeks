package defpackage;

import java.util.Collections;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٟؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227e implements InterfaceC16793e, InterfaceC4079e {
    public final List ad;
    public final String metrica;
    public final String vip;

    public C0227e(AudioTrack audioTrack) {
        List singletonList = Collections.singletonList(audioTrack);
        this.ad = singletonList;
        this.vip = BuildConfig.FLAVOR;
        this.metrica = "vk_" + singletonList.hashCode();
    }

    @Override // defpackage.InterfaceC4079e
    public final Object ad(InterfaceC5083e interfaceC5083e) {
        return this.ad;
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0227e)) {
            return false;
        }
        C0227e c0227e = (C0227e) obj;
        return AbstractC7890e.billing(this.ad, c0227e.ad) && AbstractC7890e.billing(this.vip, c0227e.vip);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.metrica;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackObjects(tracks=");
        sb.append(this.ad);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
