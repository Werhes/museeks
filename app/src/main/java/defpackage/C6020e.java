package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6020e implements InterfaceC2268e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Double f12678e;

    public C6020e(Double d) {
        if (d == null) {
            this.f12678e = Double.valueOf(Double.NaN);
        } else {
            this.f12678e = d;
        }
    }

    @Override // defpackage.InterfaceC2268e
    public final Iterator appmetrica() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6020e) {
            return this.f12678e.equals(((C6020e) obj).f12678e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12678e.hashCode();
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e remoteconfig(String str, C11467e c11467e, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C15547e(startapp());
        }
        throw new IllegalArgumentException(startapp() + "." + str + " is not a function.");
    }

    @Override // defpackage.InterfaceC2268e
    public final String startapp() {
        Double d = this.f12678e;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal valueOf = BigDecimal.valueOf(d.doubleValue());
        BigDecimal bigDecimal = valueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : valueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String format = decimalFormat.format(bigDecimal);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        return ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    @Override // defpackage.InterfaceC2268e
    public final Double subscription() {
        return this.f12678e;
    }

    @Override // defpackage.InterfaceC2268e
    public final InterfaceC2268e tapsense() {
        return new C6020e(this.f12678e);
    }

    public final String toString() {
        return startapp();
    }

    @Override // defpackage.InterfaceC2268e
    public final Boolean yandex() {
        Double d = this.f12678e;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
