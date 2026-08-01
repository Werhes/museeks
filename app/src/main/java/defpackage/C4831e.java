package defpackage;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4831e implements Comparator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f10302e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f10303e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10304e = 0;

    public C4831e(Rational rational, Rational rational2) {
        this.f10302e = rational2 == null ? new Rational(4, 3) : rational2;
        this.f10303e = vip(rational);
    }

    public C4831e(AbstractC10200e abstractC10200e, C11467e c11467e) {
        this.f10303e = abstractC10200e;
        this.f10302e = c11467e;
    }

    public static float ad(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f10304e;
        Object obj3 = this.f10303e;
        boolean z = false;
        switch (i) {
            case 0:
                Rational rational = (Rational) obj;
                Rational rational2 = (Rational) obj2;
                RectF rectF = (RectF) obj3;
                if (rational.equals(rational2)) {
                    return 0;
                }
                RectF vip = vip(rational);
                RectF vip2 = vip(rational2);
                boolean z2 = vip.width() >= rectF.width() && vip.height() >= rectF.height();
                if (vip2.width() >= rectF.width() && vip2.height() >= rectF.height()) {
                    z = true;
                }
                if (z2 && z) {
                    return (int) Math.signum((vip.height() * vip.width()) - (vip2.height() * vip2.width()));
                }
                if (z2) {
                    return -1;
                }
                if (z) {
                    return 1;
                }
                return -((int) Math.signum(ad(vip, rectF) - ad(vip2, rectF)));
            default:
                InterfaceC2268e interfaceC2268e = (InterfaceC2268e) obj;
                InterfaceC2268e interfaceC2268e2 = (InterfaceC2268e) obj2;
                if (interfaceC2268e instanceof C1058e) {
                    return !(interfaceC2268e2 instanceof C1058e) ? 1 : 0;
                }
                if (interfaceC2268e2 instanceof C1058e) {
                    return -1;
                }
                AbstractC10200e abstractC10200e = (AbstractC10200e) obj3;
                return abstractC10200e == null ? interfaceC2268e.startapp().compareTo(interfaceC2268e2.startapp()) : (int) AbstractC8677e.subscription(abstractC10200e.ad((C11467e) this.f10302e, Arrays.asList(interfaceC2268e, interfaceC2268e2)).subscription().doubleValue());
        }
    }

    public RectF vip(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = (Rational) this.f10302e;
        return floatValue == rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator()) : rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }
}
