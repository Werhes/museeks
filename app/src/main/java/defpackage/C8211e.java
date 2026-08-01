package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٍۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8211e implements InterfaceC11140e, InterfaceC4079e {
    public final List ad;
    public final String metrica;
    public final String vip;

    public C8211e(List list) {
        this.ad = list;
        StringBuilder sb = new StringBuilder("Bearer ");
        C15959e c15959e = C15959e.ad;
        C5089e c5089e = C15959e.vip;
        sb.append(c5089e.ad() ? c5089e.vip.vip : BuildConfig.FLAVOR);
        this.vip = sb.toString();
        this.metrica = "uma_" + list.hashCode();
    }

    @Override // defpackage.InterfaceC4079e
    public final Object ad(InterfaceC5083e interfaceC5083e) {
        return this.ad;
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return this.vip;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8211e) && AbstractC7890e.billing(this.ad, ((C8211e) obj).ad);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.metrica;
    }

    public final int hashCode() {
        return this.ad.hashCode() * 31;
    }

    @Override // defpackage.InterfaceC1686e
    public final String metrica() {
        return BuildConfig.FLAVOR;
    }

    @Override // defpackage.InterfaceC1686e
    public final boolean purchase() {
        return false;
    }

    public final String toString() {
        return "TrackObjects(tracks=" + this.ad + ", displayName=)";
    }
}
