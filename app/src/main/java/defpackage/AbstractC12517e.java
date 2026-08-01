package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12517e {
    public static final C5404e ad = AbstractC7205e.ad(C9582e.ad, "kotlinx.serialization.json.JsonUnquotedLiteral");

    public static final AbstractC16920e ad(Number number) {
        return new C3093e(number, false);
    }

    public static final Integer appmetrica(AbstractC16920e abstractC16920e) {
        Long l;
        try {
            l = Long.valueOf(yandex(abstractC16920e));
        } catch (C15602e unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final AbstractC16920e billing(AbstractC1948e abstractC1948e) {
        AbstractC16920e abstractC16920e = abstractC1948e instanceof AbstractC16920e ? (AbstractC16920e) abstractC1948e : null;
        if (abstractC16920e != null) {
            return abstractC16920e;
        }
        metrica(abstractC1948e, "JsonPrimitive");
        throw null;
    }

    public static final Boolean license(AbstractC16920e abstractC16920e) {
        String appmetrica = abstractC16920e.appmetrica();
        String[] strArr = AbstractC13517e.ad;
        if (appmetrica.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (appmetrica.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final void metrica(AbstractC1948e abstractC1948e, String str) {
        throw new IllegalArgumentException("Element " + AbstractC3820e.ad.vip(abstractC1948e.getClass()) + " is not a " + str);
    }

    public static final C4030e purchase(AbstractC1948e abstractC1948e) {
        C4030e c4030e = abstractC1948e instanceof C4030e ? (C4030e) abstractC1948e : null;
        if (c4030e != null) {
            return c4030e;
        }
        metrica(abstractC1948e, "JsonObject");
        throw null;
    }

    public static final AbstractC16920e vip(String str) {
        return str == null ? C11549e.INSTANCE : new C3093e(str, true);
    }

    public static final long yandex(AbstractC16920e abstractC16920e) {
        C2115e c2115e = new C2115e(abstractC16920e.appmetrica());
        long startapp = c2115e.startapp();
        if (c2115e.purchase() == 10) {
            return startapp;
        }
        int i = c2115e.vip;
        int i2 = i - 1;
        String str = c2115e.purchase;
        AbstractC8712e.admob(c2115e, AbstractC5087e.m1746extends("Expected input to contain a single valid number, but got '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' after it"), i2, null, 4);
        throw null;
    }
}
