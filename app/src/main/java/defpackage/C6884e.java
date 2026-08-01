package defpackage;

import android.util.Range;
import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6884e {
    public static final Range yandex = new Range(0, 0);
    public final Size ad;
    public final Range appmetrica;
    public final boolean billing;
    public final int license;
    public final C14677e metrica;
    public final InterfaceC12330e purchase;
    public final Size vip;

    public C6884e(Size size, Size size2, C14677e c14677e, int i, Range range, InterfaceC12330e interfaceC12330e, boolean z) {
        this.ad = size;
        this.vip = size2;
        this.metrica = c14677e;
        this.license = i;
        this.appmetrica = range;
        this.purchase = interfaceC12330e;
        this.billing = z;
    }

    public static C10017e ad(Size size) {
        C10017e c10017e = new C10017e(1);
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        c10017e.f19786e = size;
        c10017e.f19785e = size;
        c10017e.f19784e = 0;
        Range range = yandex;
        if (range == null) {
            throw new NullPointerException("Null expectedFrameRateRange");
        }
        c10017e.f19791e = range;
        c10017e.f19788e = C14677e.license;
        c10017e.f19787e = Boolean.FALSE;
        return c10017e;
    }

    public final boolean equals(Object obj) {
        InterfaceC12330e interfaceC12330e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6884e) {
            C6884e c6884e = (C6884e) obj;
            InterfaceC12330e interfaceC12330e2 = c6884e.purchase;
            if (this.ad.equals(c6884e.ad) && this.vip.equals(c6884e.vip) && this.metrica.equals(c6884e.metrica) && this.license == c6884e.license && this.appmetrica.equals(c6884e.appmetrica) && ((interfaceC12330e = this.purchase) != null ? interfaceC12330e.equals(interfaceC12330e2) : interfaceC12330e2 == null) && this.billing == c6884e.billing) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license) * 1000003) ^ this.appmetrica.hashCode()) * 1000003;
        InterfaceC12330e interfaceC12330e = this.purchase;
        return ((hashCode ^ (interfaceC12330e == null ? 0 : interfaceC12330e.hashCode())) * 1000003) ^ (this.billing ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.ad);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.vip);
        sb.append(", dynamicRange=");
        sb.append(this.metrica);
        sb.append(", sessionType=");
        sb.append(this.license);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.appmetrica);
        sb.append(", implementationOptions=");
        sb.append(this.purchase);
        sb.append(", zslDisabled=");
        return AbstractC8703e.signatures(sb, this.billing, "}");
    }

    public final C10017e vip() {
        C10017e c10017e = new C10017e(1);
        c10017e.f19786e = this.ad;
        c10017e.f19785e = this.vip;
        c10017e.f19788e = this.metrica;
        c10017e.f19784e = Integer.valueOf(this.license);
        c10017e.f19791e = this.appmetrica;
        c10017e.f19790e = this.purchase;
        c10017e.f19787e = Boolean.valueOf(this.billing);
        return c10017e;
    }
}
