package defpackage;

import java.util.Arrays;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eٜٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18231e implements InterfaceC16793e, InterfaceC4079e, InterfaceC1940e {
    public static final C0266e Companion = new Object();
    public static final InterfaceC3477e[] license = {AbstractC18039e.appmetrica(2, new C8462e(16)), null, null};
    public final List ad;
    public final String metrica;
    public final String vip;

    public /* synthetic */ C18231e(int i, String str, String str2, List list) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C4572e.ad.appmetrica());
            throw null;
        }
        this.ad = list;
        this.vip = (i & 2) == 0 ? BuildConfig.FLAVOR : str;
        if ((i & 4) != 0) {
            this.metrica = str2;
            return;
        }
        this.metrica = "vk_" + list.hashCode();
    }

    public /* synthetic */ C18231e(List list) {
        this(list, BuildConfig.FLAVOR);
    }

    public C18231e(List list, String str) {
        this.ad = list;
        this.vip = str;
        this.metrica = "vk_" + list.hashCode();
    }

    @Override // defpackage.InterfaceC4079e
    public final Object ad(InterfaceC5083e interfaceC5083e) {
        String[] strArr = (String[]) this.ad.toArray(new String[0]);
        return AbstractC18406e.yandex(new C13029e((String[]) Arrays.copyOf(strArr, strArr.length)), interfaceC5083e);
    }

    @Override // defpackage.InterfaceC1686e
    public final String billing() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18231e)) {
            return false;
        }
        C18231e c18231e = (C18231e) obj;
        return AbstractC7890e.billing(this.ad, c18231e.ad) && AbstractC7890e.billing(this.vip, c18231e.vip);
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
        StringBuilder sb = new StringBuilder("TrackIds(ids=");
        sb.append(this.ad);
        sb.append(", displayName=");
        return AbstractC4653e.applovin(sb, this.vip, ')');
    }
}
