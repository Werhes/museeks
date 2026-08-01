package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؑۛؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552e implements InterfaceC16793e, InterfaceC17992e, InterfaceC1940e {
    public static final C10362e Companion = new Object();
    public static final InterfaceC3477e[] license = {AbstractC18039e.appmetrica(2, new C14582e(24)), null, null};
    public final List ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C0552e(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C2944e.ad.appmetrica());
            throw null;
        }
        this.ad = list;
        this.vip = (i & 2) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 4) == 0) {
            this.metrica = String.valueOf(list.hashCode());
        } else {
            this.metrica = str2;
        }
    }

    public /* synthetic */ C0552e(List list) {
        this(list, BuildConfig.FLAVOR);
    }

    public C0552e(List list, String str) {
        this.ad = list;
        this.vip = str;
        this.metrica = String.valueOf(list.hashCode());
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0552e)) {
            return false;
        }
        C0552e c0552e = (C0552e) obj;
        return AbstractC7890e.billing(this.ad, c0552e.ad) && AbstractC7890e.billing(this.vip, c0552e.vip);
    }

    @Override // defpackage.InterfaceC1686e
    public final String getId() {
        return this.metrica;
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC17992e
    public final Object license(AbstractC10731e abstractC10731e) {
        return this.ad;
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
        StringBuilder sb = new StringBuilder("TrackIds(ids=");
        sb.append(this.ad);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }

    @Override // defpackage.InterfaceC17992e
    public final Object vip(List list, AbstractC10731e abstractC10731e) {
        return AbstractC10257e.ad(list, abstractC10731e);
    }
}
