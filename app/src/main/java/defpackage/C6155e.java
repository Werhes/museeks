package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6155e implements InterfaceC5366e {
    public final C10566e ad;
    public final int vip;

    public C6155e(C10566e c10566e, int i) {
        this.ad = c10566e;
        this.vip = i;
    }

    public C6155e(String str, int i) {
        this(new C10566e(str), i);
    }

    @Override // defpackage.InterfaceC5366e
    public final void ad(C11199e c11199e) {
        int i = c11199e.f22465e;
        C10566e c10566e = this.ad;
        if (i != -1) {
            c11199e.yandex(i, c11199e.f22462e, c10566e.f20850e);
        } else {
            c11199e.yandex(c11199e.f22464e, c11199e.f22463e, c10566e.f20850e);
        }
        int i2 = c11199e.f22464e;
        int i3 = c11199e.f22463e;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.vip;
        int metrica = AbstractC3062e.metrica(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c10566e.f20850e.length(), 0, ((C9831e) c11199e.f22467e).m2700interface());
        c11199e.adcel(metrica, metrica);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6155e)) {
            return false;
        }
        C6155e c6155e = (C6155e) obj;
        return AbstractC7890e.billing(this.ad.f20850e, c6155e.ad.f20850e) && this.vip == c6155e.vip;
    }

    public final int hashCode() {
        return (this.ad.f20850e.hashCode() * 31) + this.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.ad.f20850e);
        sb.append("', newCursorPosition=");
        return AbstractC1786e.pro(sb, this.vip, ')');
    }
}
