package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9531e implements InterfaceC1527e, InterfaceC11754e, InterfaceC2043e {
    public final ArrayList ad = new ArrayList();
    public final C10195e appmetrica;
    public final String license;
    public final AbstractC0232e metrica;
    public boolean vip;

    public AbstractC9531e(AbstractC0232e abstractC0232e, String str) {
        this.metrica = abstractC0232e;
        this.license = str;
        this.appmetrica = abstractC0232e.ad;
    }

    @Override // defpackage.InterfaceC11754e
    public final void Signature() {
    }

    /* renamed from: abstract, reason: not valid java name */
    public final short m2595abstract(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (!(mo265interface instanceof AbstractC16920e)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(AbstractC16920e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(mo265interface.getClass()).mopub());
            sb.append(" as the serialized body of short at element: ");
            sb.append(m2603new(str));
            throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
        }
        AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
        try {
            long yandex = AbstractC12517e.yandex(abstractC16920e);
            Short valueOf = (-32768 > yandex || yandex > 32767) ? null : Short.valueOf((short) yandex);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            m2605strictfp(abstractC16920e, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m2605strictfp(abstractC16920e, "short", str);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC2043e
    public final C10068e ad() {
        return this.metrica.vip;
    }

    @Override // defpackage.InterfaceC2043e
    public final float adcel(C3907e c3907e, int i) {
        return m2610while(m2597case(c3907e, i));
    }

    @Override // defpackage.InterfaceC11754e
    public final InterfaceC11754e admob(InterfaceC9998e interfaceC9998e) {
        if (AbstractC13480e.m3569abstract(this.ad) != null) {
            return m2609try(m2600final(), interfaceC9998e);
        }
        return new C6578e(this.metrica, mo263catch(), this.license).admob(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC11754e
    public final byte ads() {
        return m2602native(m2600final());
    }

    @Override // defpackage.InterfaceC2043e
    public final byte advert(C3907e c3907e, int i) {
        return m2602native(m2597case(c3907e, i));
    }

    @Override // defpackage.InterfaceC11754e
    public final int amazon() {
        return m2604protected(m2600final());
    }

    @Override // defpackage.InterfaceC2043e
    public final boolean applovin(InterfaceC9998e interfaceC9998e, int i) {
        return m2607this(m2597case(interfaceC9998e, i));
    }

    @Override // defpackage.InterfaceC11754e
    public final boolean appmetrica() {
        return m2607this(m2600final());
    }

    @Override // defpackage.InterfaceC11754e
    public final Object billing(InterfaceC5372e interfaceC5372e) {
        if (!(interfaceC5372e instanceof AbstractC10674e)) {
            return interfaceC5372e.metrica(this);
        }
        AbstractC0232e abstractC0232e = this.metrica;
        C10195e c10195e = abstractC0232e.ad;
        AbstractC10674e abstractC10674e = (AbstractC10674e) interfaceC5372e;
        String ad = AbstractC7711e.ad(abstractC0232e, abstractC10674e.appmetrica());
        AbstractC1948e m2601goto = m2601goto();
        String ad2 = abstractC10674e.appmetrica().ad();
        if (m2601goto instanceof C4030e) {
            C4030e c4030e = (C4030e) m2601goto;
            AbstractC1948e abstractC1948e = (AbstractC1948e) c4030e.get(ad);
            String str = null;
            if (abstractC1948e != null) {
                AbstractC16920e billing = AbstractC12517e.billing(abstractC1948e);
                if (!(billing instanceof C11549e)) {
                    str = billing.appmetrica();
                }
            }
            try {
                return AbstractC7535e.subscription(abstractC0232e, ad, c4030e, AbstractC5706e.appmetrica((AbstractC10674e) interfaceC5372e, this, str));
            } catch (C15929e e) {
                throw AbstractC3421e.appmetrica(e.getMessage(), c4030e.toString(), -1);
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C12232e c12232e = AbstractC3820e.ad;
        sb.append(c12232e.vip(C4030e.class).mopub());
        sb.append(", but had ");
        sb.append(c12232e.vip(m2601goto.getClass()).mopub());
        sb.append(" as the serialized body of ");
        sb.append(ad2);
        sb.append(" at element: ");
        sb.append(m2606super());
        throw AbstractC3421e.appmetrica(sb.toString(), m2601goto.toString(), -1);
    }

    /* renamed from: break, reason: not valid java name */
    public final long m2596break(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (mo265interface instanceof AbstractC16920e) {
            AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
            try {
                return AbstractC12517e.yandex(abstractC16920e);
            } catch (IllegalArgumentException unused) {
                m2605strictfp(abstractC16920e, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C12232e c12232e = AbstractC3820e.ad;
        sb.append(c12232e.vip(AbstractC16920e.class).mopub());
        sb.append(", but had ");
        sb.append(c12232e.vip(mo265interface.getClass()).mopub());
        sb.append(" as the serialized body of long at element: ");
        sb.append(m2603new(str));
        throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
    }

    /* renamed from: case, reason: not valid java name */
    public final String m2597case(InterfaceC9998e interfaceC9998e, int i) {
        String mo264implements = mo264implements(interfaceC9998e, i);
        return mo264implements;
    }

    /* renamed from: catch */
    public abstract AbstractC1948e mo263catch();

    @Override // defpackage.InterfaceC11754e
    /* renamed from: class */
    public final double mo501class() {
        return m2608throw(m2600final());
    }

    @Override // defpackage.InterfaceC11754e
    public final float crashlytics() {
        return m2610while(m2600final());
    }

    /* renamed from: default, reason: not valid java name */
    public final String m2598default(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (!(mo265interface instanceof AbstractC16920e)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(AbstractC16920e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(mo265interface.getClass()).mopub());
            sb.append(" as the serialized body of string at element: ");
            sb.append(m2603new(str));
            throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
        }
        AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
        if (!(abstractC16920e instanceof C3093e)) {
            StringBuilder applovin = AbstractC8703e.applovin("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            applovin.append(m2603new(str));
            throw AbstractC3421e.appmetrica(applovin.toString(), m2601goto().toString(), -1);
        }
        C3093e c3093e = (C3093e) abstractC16920e;
        if (c3093e.f7178e || this.metrica.ad.metrica) {
            return c3093e.f7177e;
        }
        StringBuilder applovin2 = AbstractC8703e.applovin("String literal for key '", str, "' should be quoted at element: ");
        applovin2.append(m2603new(str));
        applovin2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw AbstractC3421e.appmetrica(applovin2.toString(), m2601goto().toString(), -1);
    }

    /* renamed from: extends, reason: not valid java name */
    public final char m2599extends(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (!(mo265interface instanceof AbstractC16920e)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(AbstractC16920e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(mo265interface.getClass()).mopub());
            sb.append(" as the serialized body of char at element: ");
            sb.append(m2603new(str));
            throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
        }
        AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
        try {
            String appmetrica = abstractC16920e.appmetrica();
            int length = appmetrica.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return appmetrica.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m2605strictfp(abstractC16920e, "char", str);
            throw null;
        }
    }

    /* renamed from: final, reason: not valid java name */
    public final Object m2600final() {
        ArrayList arrayList = this.ad;
        Object remove = arrayList.remove(AbstractC6874e.billing(arrayList));
        this.vip = true;
        return remove;
    }

    @Override // defpackage.InterfaceC2043e
    public final long firebase(InterfaceC9998e interfaceC9998e, int i) {
        return m2596break(m2597case(interfaceC9998e, i));
    }

    /* renamed from: goto, reason: not valid java name */
    public final AbstractC1948e m2601goto() {
        AbstractC1948e mo265interface;
        String str = (String) AbstractC13480e.m3569abstract(this.ad);
        return (str == null || (mo265interface = mo265interface(str)) == null) ? mo263catch() : mo265interface;
    }

    /* renamed from: implements */
    public String mo264implements(InterfaceC9998e interfaceC9998e, int i) {
        return interfaceC9998e.billing(i);
    }

    @Override // defpackage.InterfaceC2043e
    public final Object inmobi(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        this.ad.add(m2597case(interfaceC9998e, i));
        Object billing = (interfaceC5372e.appmetrica().metrica() || isVip()) ? billing(interfaceC5372e) : null;
        if (!this.vip) {
            m2600final();
        }
        this.vip = false;
        return billing;
    }

    /* renamed from: interface */
    public abstract AbstractC1948e mo265interface(String str);

    @Override // defpackage.InterfaceC1527e
    public final AbstractC0232e isPro() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC11754e
    public boolean isVip() {
        return !(m2601goto() instanceof C11549e);
    }

    @Override // defpackage.InterfaceC2043e
    public final InterfaceC11754e license(C3907e c3907e, int i) {
        return m2609try(m2597case(c3907e, i), c3907e.adcel(i));
    }

    @Override // defpackage.InterfaceC2043e
    public final short loadAd(C3907e c3907e, int i) {
        return m2595abstract(m2597case(c3907e, i));
    }

    @Override // defpackage.InterfaceC11754e
    public InterfaceC2043e metrica(InterfaceC9998e interfaceC9998e) {
        AbstractC1948e m2601goto = m2601goto();
        AbstractC8457e appmetrica = interfaceC9998e.appmetrica();
        boolean billing = AbstractC7890e.billing(appmetrica, C3016e.appmetrica);
        AbstractC0232e abstractC0232e = this.metrica;
        if (billing || (appmetrica instanceof AbstractC13637e)) {
            String ad = interfaceC9998e.ad();
            if (m2601goto instanceof C7960e) {
                return new C0688e(abstractC0232e, (C7960e) m2601goto);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(C7960e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(m2601goto.getClass()).mopub());
            sb.append(" as the serialized body of ");
            sb.append(ad);
            sb.append(" at element: ");
            sb.append(m2606super());
            throw AbstractC3421e.appmetrica(sb.toString(), m2601goto.toString(), -1);
        }
        if (!AbstractC7890e.billing(appmetrica, C18215e.appmetrica)) {
            String ad2 = interfaceC9998e.ad();
            if (m2601goto instanceof C4030e) {
                return new C0203e(abstractC0232e, (C4030e) m2601goto, this.license, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            C12232e c12232e2 = AbstractC3820e.ad;
            sb2.append(c12232e2.vip(C4030e.class).mopub());
            sb2.append(", but had ");
            sb2.append(c12232e2.vip(m2601goto.getClass()).mopub());
            sb2.append(" as the serialized body of ");
            sb2.append(ad2);
            sb2.append(" at element: ");
            sb2.append(m2606super());
            throw AbstractC3421e.appmetrica(sb2.toString(), m2601goto.toString(), -1);
        }
        InterfaceC9998e ad3 = AbstractC18127e.ad(interfaceC9998e.adcel(0), abstractC0232e.vip);
        AbstractC8457e appmetrica2 = ad3.appmetrica();
        if ((appmetrica2 instanceof AbstractC5296e) || AbstractC7890e.billing(appmetrica2, C7784e.appmetrica)) {
            String ad4 = interfaceC9998e.ad();
            if (m2601goto instanceof C4030e) {
                return new C6154e(abstractC0232e, (C4030e) m2601goto);
            }
            StringBuilder sb3 = new StringBuilder("Expected ");
            C12232e c12232e3 = AbstractC3820e.ad;
            sb3.append(c12232e3.vip(C4030e.class).mopub());
            sb3.append(", but had ");
            sb3.append(c12232e3.vip(m2601goto.getClass()).mopub());
            sb3.append(" as the serialized body of ");
            sb3.append(ad4);
            sb3.append(" at element: ");
            sb3.append(m2606super());
            throw AbstractC3421e.appmetrica(sb3.toString(), m2601goto.toString(), -1);
        }
        if (!abstractC0232e.ad.license) {
            throw AbstractC3421e.metrica(ad3);
        }
        String ad5 = interfaceC9998e.ad();
        if (m2601goto instanceof C7960e) {
            return new C0688e(abstractC0232e, (C7960e) m2601goto);
        }
        StringBuilder sb4 = new StringBuilder("Expected ");
        C12232e c12232e4 = AbstractC3820e.ad;
        sb4.append(c12232e4.vip(C7960e.class).mopub());
        sb4.append(", but had ");
        sb4.append(c12232e4.vip(m2601goto.getClass()).mopub());
        sb4.append(" as the serialized body of ");
        sb4.append(ad5);
        sb4.append(" at element: ");
        sb4.append(m2606super());
        throw AbstractC3421e.appmetrica(sb4.toString(), m2601goto.toString(), -1);
    }

    @Override // defpackage.InterfaceC1527e
    public final AbstractC1948e mopub() {
        return m2601goto();
    }

    /* renamed from: native, reason: not valid java name */
    public final byte m2602native(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (!(mo265interface instanceof AbstractC16920e)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(AbstractC16920e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(mo265interface.getClass()).mopub());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(m2603new(str));
            throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
        }
        AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
        try {
            long yandex = AbstractC12517e.yandex(abstractC16920e);
            Byte valueOf = (-128 > yandex || yandex > 127) ? null : Byte.valueOf((byte) yandex);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            m2605strictfp(abstractC16920e, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m2605strictfp(abstractC16920e, "byte", str);
            throw null;
        }
    }

    /* renamed from: new, reason: not valid java name */
    public final String m2603new(String str) {
        return m2606super() + '.' + str;
    }

    @Override // defpackage.InterfaceC2043e
    public final double premium(InterfaceC9998e interfaceC9998e, int i) {
        return m2608throw(m2597case(interfaceC9998e, i));
    }

    @Override // defpackage.InterfaceC11754e
    public final String pro() {
        return m2598default(m2600final());
    }

    /* renamed from: protected, reason: not valid java name */
    public final int m2604protected(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (!(mo265interface instanceof AbstractC16920e)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(AbstractC16920e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(mo265interface.getClass()).mopub());
            sb.append(" as the serialized body of int at element: ");
            sb.append(m2603new(str));
            throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
        }
        AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
        try {
            long yandex = AbstractC12517e.yandex(abstractC16920e);
            Integer valueOf = (-2147483648L > yandex || yandex > 2147483647L) ? null : Integer.valueOf((int) yandex);
            if (valueOf != null) {
                return valueOf.intValue();
            }
            m2605strictfp(abstractC16920e, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m2605strictfp(abstractC16920e, "int", str);
            throw null;
        }
    }

    @Override // defpackage.InterfaceC11754e
    public final char purchase() {
        return m2599extends(m2600final());
    }

    @Override // defpackage.InterfaceC2043e
    public final int remoteconfig(InterfaceC9998e interfaceC9998e, int i) {
        return m2604protected(m2597case(interfaceC9998e, i));
    }

    @Override // defpackage.InterfaceC11754e
    public final int signatures(InterfaceC9998e interfaceC9998e) {
        String str = (String) m2600final();
        AbstractC1948e mo265interface = mo265interface(str);
        String ad = interfaceC9998e.ad();
        if (mo265interface instanceof AbstractC16920e) {
            return AbstractC6629e.mopub(interfaceC9998e, this.metrica, ((AbstractC16920e) mo265interface).appmetrica(), BuildConfig.FLAVOR);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C12232e c12232e = AbstractC3820e.ad;
        sb.append(c12232e.vip(AbstractC16920e.class).mopub());
        sb.append(", but had ");
        sb.append(c12232e.vip(mo265interface.getClass()).mopub());
        sb.append(" as the serialized body of ");
        sb.append(ad);
        sb.append(" at element: ");
        sb.append(m2603new(str));
        throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
    }

    @Override // defpackage.InterfaceC2043e
    public final String smaato(InterfaceC9998e interfaceC9998e, int i) {
        return m2598default(m2597case(interfaceC9998e, i));
    }

    @Override // defpackage.InterfaceC2043e
    public final char startapp(C3907e c3907e, int i) {
        return m2599extends(m2597case(c3907e, i));
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m2605strictfp(AbstractC16920e abstractC16920e, String str, String str2) {
        throw AbstractC3421e.appmetrica("Failed to parse literal '" + abstractC16920e + "' as " + (AbstractC6507e.pro(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + m2603new(str2), m2601goto().toString(), -1);
    }

    @Override // defpackage.InterfaceC11754e
    public final short subs() {
        return m2595abstract(m2600final());
    }

    @Override // defpackage.InterfaceC2043e
    public final Object subscription(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        this.ad.add(m2597case(interfaceC9998e, i));
        Object billing = billing(interfaceC5372e);
        if (!this.vip) {
            m2600final();
        }
        this.vip = false;
        return billing;
    }

    /* renamed from: super, reason: not valid java name */
    public final String m2606super() {
        ArrayList arrayList = this.ad;
        return arrayList.isEmpty() ? "$" : AbstractC13480e.m3608try(arrayList, ".", "$.", null, null, 60);
    }

    @Override // defpackage.InterfaceC11754e
    public final long tapsense() {
        return m2596break(m2600final());
    }

    /* renamed from: this, reason: not valid java name */
    public final boolean m2607this(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (mo265interface instanceof AbstractC16920e) {
            AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
            try {
                Boolean license = AbstractC12517e.license(abstractC16920e);
                if (license != null) {
                    return license.booleanValue();
                }
                m2605strictfp(abstractC16920e, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m2605strictfp(abstractC16920e, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C12232e c12232e = AbstractC3820e.ad;
        sb.append(c12232e.vip(AbstractC16920e.class).mopub());
        sb.append(", but had ");
        sb.append(c12232e.vip(mo265interface.getClass()).mopub());
        sb.append(" as the serialized body of boolean at element: ");
        sb.append(m2603new(str));
        throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
    }

    /* renamed from: throw, reason: not valid java name */
    public final double m2608throw(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (!(mo265interface instanceof AbstractC16920e)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(AbstractC16920e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(mo265interface.getClass()).mopub());
            sb.append(" as the serialized body of double at element: ");
            sb.append(m2603new(str));
            throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
        }
        AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
        try {
            C5404e c5404e = AbstractC12517e.ad;
            double parseDouble = Double.parseDouble(abstractC16920e.appmetrica());
            if (this.metrica.ad.startapp || Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            throw AbstractC3421e.ad(Double.valueOf(parseDouble), str, m2601goto().toString());
        } catch (IllegalArgumentException unused) {
            m2605strictfp(abstractC16920e, "double", str);
            throw null;
        }
    }

    /* renamed from: try, reason: not valid java name */
    public final InterfaceC11754e m2609try(Object obj, InterfaceC9998e interfaceC9998e) {
        String str = (String) obj;
        if (!AbstractC17276e.ad(interfaceC9998e)) {
            this.ad.add(str);
            return this;
        }
        AbstractC1948e mo265interface = mo265interface(str);
        String ad = interfaceC9998e.ad();
        if (mo265interface instanceof AbstractC16920e) {
            String appmetrica = ((AbstractC16920e) mo265interface).appmetrica();
            AbstractC0232e abstractC0232e = this.metrica;
            C10195e c10195e = abstractC0232e.ad;
            return new C16337e(new C2115e(appmetrica), abstractC0232e);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C12232e c12232e = AbstractC3820e.ad;
        sb.append(c12232e.vip(AbstractC16920e.class).mopub());
        sb.append(", but had ");
        sb.append(c12232e.vip(mo265interface.getClass()).mopub());
        sb.append(" as the serialized body of ");
        sb.append(ad);
        sb.append(" at element: ");
        sb.append(m2603new(str));
        throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
    }

    public void vip(InterfaceC9998e interfaceC9998e) {
    }

    /* renamed from: while, reason: not valid java name */
    public final float m2610while(Object obj) {
        String str = (String) obj;
        AbstractC1948e mo265interface = mo265interface(str);
        if (!(mo265interface instanceof AbstractC16920e)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C12232e c12232e = AbstractC3820e.ad;
            sb.append(c12232e.vip(AbstractC16920e.class).mopub());
            sb.append(", but had ");
            sb.append(c12232e.vip(mo265interface.getClass()).mopub());
            sb.append(" as the serialized body of float at element: ");
            sb.append(m2603new(str));
            throw AbstractC3421e.appmetrica(sb.toString(), mo265interface.toString(), -1);
        }
        AbstractC16920e abstractC16920e = (AbstractC16920e) mo265interface;
        try {
            C5404e c5404e = AbstractC12517e.ad;
            float parseFloat = Float.parseFloat(abstractC16920e.appmetrica());
            if (this.metrica.ad.startapp || Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            throw AbstractC3421e.ad(Float.valueOf(parseFloat), str, m2601goto().toString());
        } catch (IllegalArgumentException unused) {
            m2605strictfp(abstractC16920e, "float", str);
            throw null;
        }
    }
}
