package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8746e implements InterfaceC11934e {
    public static final C8746e appmetrica;
    public static final C8746e license;
    public static final C8746e metrica;
    public final C17127e ad;
    public final C5363e vip = new C5363e(new C3411e(14, this));

    static {
        C17127e c17127e = new C17127e();
        C3295e c3295e = C3295e.f7451e;
        c17127e.license(c3295e);
        Unit unit = Unit.INSTANCE;
        c17127e.ad = true;
        new C8746e(c17127e);
        C17127e c17127e2 = new C17127e();
        c17127e2.adcel();
        Unit unit2 = Unit.INSTANCE;
        c17127e2.ad = true;
        new C8746e(c17127e2);
        C17127e c17127e3 = new C17127e();
        c17127e3.adcel();
        c17127e3.license(c3295e);
        Unit unit3 = Unit.INSTANCE;
        c17127e3.ad = true;
        new C8746e(c17127e3);
        C17127e c17127e4 = new C17127e();
        c17127e4.adcel();
        c17127e4.license(c3295e);
        c17127e4.smaato();
        Unit unit4 = Unit.INSTANCE;
        c17127e4.ad = true;
        new C8746e(c17127e4);
        C17127e c17127e5 = new C17127e();
        c17127e5.license(c3295e);
        C5519e c5519e = C5519e.metrica;
        c17127e5.billing(c5519e);
        EnumC7280e enumC7280e = EnumC7280e.f14888e;
        c17127e5.yandex(enumC7280e);
        Unit unit5 = Unit.INSTANCE;
        c17127e5.ad = true;
        new C8746e(c17127e5);
        C17127e c17127e6 = new C17127e();
        c17127e6.adcel();
        c17127e6.license(c3295e);
        c17127e6.billing(c5519e);
        c17127e6.purchase();
        c17127e6.yandex(EnumC7280e.f14887e);
        c17127e6.ad();
        c17127e6.metrica();
        c17127e6.smaato();
        c17127e6.startapp();
        Unit unit6 = Unit.INSTANCE;
        c17127e6.ad = true;
        new C8746e(c17127e6);
        C17127e c17127e7 = new C17127e();
        c17127e7.license(EnumC7095e.f14554e);
        Unit unit7 = Unit.INSTANCE;
        c17127e7.ad = true;
        metrica = new C8746e(c17127e7);
        C17127e c17127e8 = new C17127e();
        c17127e8.license(EnumC7095e.f14550e);
        Unit unit8 = Unit.INSTANCE;
        c17127e8.ad = true;
        new C8746e(c17127e8);
        C17127e c17127e9 = new C17127e();
        c17127e9.billing(c5519e);
        c17127e9.yandex(enumC7280e);
        Unit unit9 = Unit.INSTANCE;
        c17127e9.ad = true;
        license = new C8746e(c17127e9);
        C17127e c17127e10 = new C17127e();
        c17127e10.vip();
        c17127e10.billing(C5519e.vip);
        c17127e10.license(EnumC7095e.f14550e);
        Unit unit10 = Unit.INSTANCE;
        c17127e10.ad = true;
        appmetrica = new C8746e(c17127e10);
        C17127e c17127e11 = new C17127e();
        c17127e11.advert();
        c17127e11.license(EnumC7095e.f14550e);
        Unit unit11 = Unit.INSTANCE;
        c17127e11.ad = true;
        new C8746e(c17127e11);
    }

    public C8746e(C17127e c17127e) {
        this.ad = c17127e;
    }

    public static final void amazon(C8746e c8746e, InterfaceC2188e interfaceC2188e, StringBuilder sb) {
        boolean admob = c8746e.admob();
        C17127e c17127e = c8746e.ad;
        if (!admob) {
            C1577e c1577e = c17127e.billing;
            InterfaceC8614e[] interfaceC8614eArr = C17127e.f33518strictfp;
            InterfaceC8614e interfaceC8614e = interfaceC8614eArr[5];
            if (!((Boolean) c1577e.ad).booleanValue()) {
                c8746e.premium(sb, interfaceC2188e.mo2242e());
                if (c8746e.Signature().contains(EnumC7095e.ANNOTATIONS)) {
                    c8746e.inmobi(sb, interfaceC2188e, null);
                    C10109e mo764e = interfaceC2188e.mo764e();
                    if (mo764e != null) {
                        c8746e.inmobi(sb, mo764e, EnumC13729e.FIELD);
                    }
                    C10109e mo765e = interfaceC2188e.mo765e();
                    if (mo765e != null) {
                        c8746e.inmobi(sb, mo765e, EnumC13729e.PROPERTY_DELEGATE_FIELD);
                    }
                    C1577e c1577e2 = c17127e.f33527goto;
                    InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[32];
                    if (((EnumC1891e) c1577e2.ad) == EnumC1891e.f5033e) {
                        C7901e metrica2 = interfaceC2188e.metrica();
                        if (metrica2 != null) {
                            c8746e.inmobi(sb, metrica2, EnumC13729e.PROPERTY_GETTER);
                        }
                        C2042e appmetrica2 = interfaceC2188e.appmetrica();
                        if (appmetrica2 != null) {
                            c8746e.inmobi(sb, appmetrica2, EnumC13729e.PROPERTY_SETTER);
                            c8746e.inmobi(sb, (C13043e) AbstractC13480e.m3590instanceof(appmetrica2.mo330e()), EnumC13729e.SETTER_PARAMETER);
                        }
                    }
                }
                c8746e.m2492static(interfaceC2188e.advert(), sb);
                c8746e.m2500while(sb, c8746e.Signature().contains(EnumC7095e.CONST) && interfaceC2188e.mo831e(), "const");
                c8746e.m2487native(interfaceC2188e, sb);
                c8746e.m2497throw(interfaceC2188e, sb);
                c8746e.m2479default(interfaceC2188e, sb);
                c8746e.m2500while(sb, c8746e.Signature().contains(EnumC7095e.LATEINIT) && interfaceC2188e.mo2388e(), "lateinit");
                c8746e.m2496this(interfaceC2188e, sb);
            }
            c8746e.m2498transient(interfaceC2188e, sb, false);
            c8746e.m2489package(sb, interfaceC2188e.getTypeParameters(), true);
            C16169e mo327e = interfaceC2188e.mo327e();
            if (mo327e != null) {
                c8746e.inmobi(sb, mo327e, EnumC13729e.RECEIVER);
                sb.append(c8746e.m2478class(mo327e.ad(), false));
                sb.append(".");
            }
        }
        c8746e.m2491protected(interfaceC2188e, sb, true);
        sb.append(": ");
        sb.append(c8746e.m2481final(interfaceC2188e.ad()));
        c8746e.m2477case(interfaceC2188e, sb);
        c8746e.m2486interface(interfaceC2188e, sb);
        c8746e.m2495synchronized(sb, interfaceC2188e.getTypeParameters());
    }

    /* renamed from: catch, reason: not valid java name */
    public static void m2473catch(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* renamed from: return, reason: not valid java name */
    public static boolean m2474return(AbstractC1186e abstractC1186e) {
        if (!AbstractC16155e.advert(abstractC1186e)) {
            return false;
        }
        List mopub = abstractC1186e.mopub();
        if (mopub != null && mopub.isEmpty()) {
            return true;
        }
        Iterator it = mopub.iterator();
        while (it.hasNext()) {
            if (((AbstractC16232e) it.next()).metrica()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int signatures(defpackage.InterfaceC17577e r5) {
        /*
            boolean r0 = r5 instanceof defpackage.InterfaceC5052e
            r1 = 4
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L10
            eؗٞؓ r5 = (defpackage.InterfaceC5052e) r5
            int r5 = r5.mo1724e()
            if (r5 != r2) goto L52
            goto L4f
        L10:
            eِٕٖ r0 = r5.mo1351switch()
            boolean r4 = r0 instanceof defpackage.InterfaceC5052e
            if (r4 == 0) goto L1b
            eؗٞؓ r0 = (defpackage.InterfaceC5052e) r0
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L1f
            goto L52
        L1f:
            boolean r4 = r5 instanceof defpackage.InterfaceC0390e
            if (r4 != 0) goto L24
            goto L52
        L24:
            eؑٚؐ r5 = (defpackage.InterfaceC0390e) r5
            java.util.Collection r4 = r5.mo337finally()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L37
            int r4 = r0.mo1718extends()
            if (r4 == r3) goto L37
            goto L50
        L37:
            int r0 = r0.mo1724e()
            if (r0 != r2) goto L52
            eًؙۡ r0 = r5.advert()
            eًؙۡ r2 = defpackage.AbstractC6050e.ad
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r2)
            if (r0 != 0) goto L52
            int r5 = r5.mo1718extends()
            if (r5 != r1) goto L50
        L4f:
            return r1
        L50:
            r5 = 3
            return r5
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8746e.signatures(eؘ٘ؓ):int");
    }

    public final Set Signature() {
        C1577e c1577e = this.ad.appmetrica;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[3];
        return (Set) c1577e.ad;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bc  */
    /* renamed from: abstract, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2475abstract(java.lang.StringBuilder r25, defpackage.AbstractC1186e r26) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8746e.m2475abstract(java.lang.StringBuilder, eٜؒؒ):void");
    }

    @Override // defpackage.InterfaceC11934e
    public final void ad() {
        this.ad.ad();
    }

    @Override // defpackage.InterfaceC11934e
    public final void adcel() {
        this.ad.adcel();
    }

    public final boolean admob() {
        C1577e c1577e = this.ad.purchase;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[4];
        return ((Boolean) c1577e.ad).booleanValue();
    }

    public final String ads(AbstractC13656e abstractC13656e) {
        C1577e c1577e = this.ad.tapsense;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[20];
        Function1 function1 = (Function1) c1577e.ad;
        if (function1 != null) {
            return (String) function1.invoke(abstractC13656e);
        }
        if (abstractC13656e instanceof C16938e) {
            Iterable iterable = (Iterable) ((C16938e) abstractC13656e).ad;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String ads = ads((AbstractC13656e) it.next());
                if (ads != null) {
                    arrayList.add(ads);
                }
            }
            return AbstractC13480e.m3608try(arrayList, ", ", "{", "}", null, 56);
        }
        if (abstractC13656e instanceof C16621e) {
            return AbstractC5304e.m1852case(isVip((InterfaceC16566e) ((C16621e) abstractC13656e).ad, null), "@");
        }
        if (!(abstractC13656e instanceof C5644e)) {
            return abstractC13656e.toString();
        }
        AbstractC4488e abstractC4488e = (AbstractC4488e) ((C5644e) abstractC13656e).ad;
        if (abstractC4488e instanceof C16637e) {
            return ((C16637e) abstractC4488e).ad + "::class";
        }
        if (!(abstractC4488e instanceof C1646e)) {
            throw new C14803e(10);
        }
        C5302e c5302e = ((C1646e) abstractC4488e).ad;
        String str = c5302e.ad.ad().ad.ad;
        int i = c5302e.vip;
        for (int i2 = 0; i2 < i; i2++) {
            str = AbstractC17861e.advert('>', "kotlin.Array<", str);
        }
        return AbstractC10257e.adcel(str, "::class");
    }

    @Override // defpackage.InterfaceC11934e
    public final void advert() {
        this.ad.advert();
    }

    public final void applovin(InterfaceC2978e interfaceC2978e, StringBuilder sb) {
        List mo1221e = interfaceC2978e.mo1221e();
        List parameters = interfaceC2978e.mo1459goto().getParameters();
        if (pro() && interfaceC2978e.mo1222instanceof() && parameters.size() > mo1221e.size()) {
            sb.append(" /*captured type parameters: ");
            m2490private(sb, parameters.subList(mo1221e.size(), parameters.size()));
            sb.append("*/");
        }
    }

    @Override // defpackage.InterfaceC11934e
    public final void appmetrica(LinkedHashSet linkedHashSet) {
        this.ad.appmetrica(linkedHashSet);
    }

    @Override // defpackage.InterfaceC11934e
    public final void billing(InterfaceC3810e interfaceC3810e) {
        this.ad.billing(interfaceC3810e);
    }

    /* renamed from: break, reason: not valid java name */
    public final void m2476break(StringBuilder sb, AbstractC1186e abstractC1186e) {
        AbstractC15728e subscription = abstractC1186e.subscription();
        Cinstanceof cinstanceof = subscription instanceof Cinstanceof ? (Cinstanceof) subscription : null;
        if (cinstanceof == null) {
            m2475abstract(sb, abstractC1186e);
            return;
        }
        AbstractC10226e abstractC10226e = cinstanceof.f36405e;
        AbstractC10226e abstractC10226e2 = cinstanceof.f36406e;
        C17127e c17127e = this.ad;
        C1577e c1577e = c17127e.f33524default;
        InterfaceC8614e[] interfaceC8614eArr = C17127e.f33518strictfp;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[42];
        boolean booleanValue = ((Boolean) c1577e.ad).booleanValue();
        C18008e c18008e = EnumC7201e.f14709e;
        if (booleanValue) {
            m2475abstract(sb, abstractC10226e2);
            C1577e c1577e2 = c17127e.f33528implements;
            InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[43];
            if (((Boolean) c1577e2.ad).booleanValue()) {
                if (subscription() == c18008e) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                m2475abstract(sb, abstractC10226e);
                sb.append(" */");
                if (subscription() == c18008e) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m2475abstract(sb, abstractC10226e);
        C1577e c1577e3 = c17127e.f33519abstract;
        InterfaceC8614e interfaceC8614e3 = interfaceC8614eArr[41];
        if (((Boolean) c1577e3.ad).booleanValue()) {
            if (subscription() == c18008e) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            m2475abstract(sb, abstractC10226e2);
            sb.append(" */");
            if (subscription() == c18008e) {
                sb.append("</i></font>");
            }
        }
    }

    /* renamed from: case, reason: not valid java name */
    public final void m2477case(InterfaceC0390e interfaceC0390e, StringBuilder sb) {
        C16169e mo327e;
        C1577e c1577e = this.ad.f33523class;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[30];
        if (((Boolean) c1577e.ad).booleanValue() && (mo327e = interfaceC0390e.mo327e()) != null) {
            sb.append(" on ");
            sb.append(m2481final(mo327e.ad()));
        }
    }

    /* renamed from: class, reason: not valid java name */
    public final String m2478class(AbstractC1186e abstractC1186e, boolean z) {
        String m2481final = m2481final(abstractC1186e);
        return ((!m2474return(abstractC1186e) || AbstractC11957e.appmetrica(abstractC1186e)) && !(abstractC1186e instanceof C12519e) && (!z || abstractC1186e.getAnnotations().isEmpty())) ? m2481final : AbstractC17861e.advert(')', "(", m2481final);
    }

    public final String crashlytics(String str) {
        int ordinal = subscription().ordinal();
        if (ordinal == 0) {
            return str;
        }
        if (ordinal == 1) {
            return AbstractC5087e.m1746extends("<font color=red><b>", str, "</b></font>");
        }
        throw new C14803e(10);
    }

    /* renamed from: default, reason: not valid java name */
    public final void m2479default(InterfaceC0390e interfaceC0390e, StringBuilder sb) {
        if (Signature().contains(EnumC7095e.OVERRIDE) && !interfaceC0390e.mo337finally().isEmpty()) {
            C1577e c1577e = this.ad.premium;
            InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[26];
            if (((EnumC12498e) c1577e.ad) != EnumC12498e.f25029e) {
                m2500while(sb, true, "override");
                if (pro()) {
                    sb.append("/*");
                    sb.append(interfaceC0390e.mo337finally().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m2480extends(int i, int i2, StringBuilder sb) {
        String str;
        C1577e c1577e = this.ad.Signature;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[14];
        if (((Boolean) c1577e.ad).booleanValue() || i != i2) {
            boolean contains = Signature().contains(EnumC7095e.MODALITY);
            if (i == 1) {
                str = "FINAL";
            } else if (i == 2) {
                str = "SEALED";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            m2500while(sb, contains, AbstractC6022e.startapp(str));
        }
    }

    /* renamed from: final, reason: not valid java name */
    public final String m2481final(AbstractC1186e abstractC1186e) {
        StringBuilder sb = new StringBuilder();
        C1577e c1577e = this.ad.isPro;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[23];
        m2476break(sb, (AbstractC1186e) ((Function1) c1577e.ad).invoke(abstractC1186e));
        return sb.toString();
    }

    public final String firebase(String str, String str2, AbstractC13270e abstractC13270e) {
        if (AbstractC10681e.mopub(str, str2)) {
            return AbstractC6507e.pro(str2, "(", false) ? AbstractC5087e.m1746extends("(", str, ")!") : str.concat("!");
        }
        int i = 1;
        String yandex = AbstractC10681e.yandex(str, str2, new C0883e(this, abstractC13270e, 0), new C0883e(this, abstractC13270e, i), new C2098e(i, this, C8746e.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 12));
        if (yandex != null) {
            return yandex;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* renamed from: goto, reason: not valid java name */
    public final String m2482goto(String str) {
        int ordinal = subscription().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            C1577e c1577e = this.ad.f33533super;
            InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[48];
            if (!((Boolean) c1577e.ad).booleanValue()) {
                return AbstractC5087e.m1746extends("<b>", str, "</b>");
            }
        }
        return str;
    }

    /* renamed from: implements, reason: not valid java name */
    public final void m2483implements(StringBuilder sb, C0909e c0909e) {
        C0909e c0909e2 = (C0909e) c0909e.f3321e;
        InterfaceC2978e interfaceC2978e = (InterfaceC2978e) c0909e.f3323e;
        if (c0909e2 != null) {
            m2483implements(sb, c0909e2);
            sb.append('.');
            sb.append(m2499try(interfaceC2978e.getName(), false));
        } else {
            sb.append(m2488new(interfaceC2978e.mo1459goto()));
        }
        sb.append(m2494super((List) c0909e.f3322e));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* renamed from: import, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2484import(defpackage.C13043e r11, boolean r12, java.lang.StringBuilder r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8746e.m2484import(eْؖؕ, boolean, java.lang.StringBuilder, boolean):void");
    }

    public final void inmobi(StringBuilder sb, InterfaceC15633e interfaceC15633e, EnumC13729e enumC13729e) {
        Set set;
        if (Signature().contains(EnumC7095e.ANNOTATIONS)) {
            boolean z = interfaceC15633e instanceof AbstractC1186e;
            C17127e c17127e = this.ad;
            if (z) {
                set = c17127e.mopub();
            } else {
                C1577e c1577e = c17127e.f33525extends;
                InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[35];
                set = (Set) c1577e.ad;
            }
            C1577e c1577e2 = c17127e.f33537while;
            InterfaceC8614e interfaceC8614e2 = C17127e.f33518strictfp[37];
            Function1 function1 = (Function1) c1577e2.ad;
            for (InterfaceC16566e interfaceC16566e : interfaceC15633e.getAnnotations()) {
                if (!AbstractC13480e.ads(set, interfaceC16566e.mopub()) && !AbstractC7890e.billing(interfaceC16566e.mopub(), AbstractC0206e.subscription) && (function1 == null || ((Boolean) function1.invoke(interfaceC16566e)).booleanValue())) {
                    sb.append(isVip(interfaceC16566e, enumC13729e));
                    C1577e c1577e3 = c17127e.f33530native;
                    InterfaceC8614e interfaceC8614e3 = C17127e.f33518strictfp[34];
                    if (((Boolean) c1577e3.ad).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        if (r10 == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* renamed from: instanceof, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2485instanceof(java.lang.StringBuilder r8, java.util.List r9, boolean r10) {
        /*
            r7 = this;
            eٗٛۢ r0 = r7.ad
            eؓؕ r0 = r0.firebase
            eٌَۧ[] r1 = defpackage.C17127e.f33518strictfp
            r2 = 29
            r1 = r1[r2]
            java.lang.Object r0 = r0.ad
            eؚٛ٘ r0 = (defpackage.EnumC7280e) r0
            int r0 = r0.ordinal()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L27
            if (r0 == r2) goto L25
            r10 = 2
            if (r0 != r10) goto L1d
        L1b:
            r10 = r1
            goto L28
        L1d:
            eٔٚؖ r8 = new eٔٚؖ
            r9 = 10
            r8.<init>(r9)
            throw r8
        L25:
            if (r10 != 0) goto L1b
        L27:
            r10 = r2
        L28:
            int r0 = r9.size()
            eِٜٔ r3 = r7.remoteconfig()
            r3.getClass()
            java.lang.String r3 = "("
            r8.append(r3)
            java.util.Iterator r9 = r9.iterator()
            r3 = r1
        L3d:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L67
            int r4 = r3 + 1
            java.lang.Object r5 = r9.next()
            eْؖؕ r5 = (defpackage.C13043e) r5
            eِٜٔ r6 = r7.remoteconfig()
            r6.getClass()
            r7.m2484import(r5, r10, r8, r1)
            eِٜٔ r5 = r7.remoteconfig()
            r5.getClass()
            int r5 = r0 + (-1)
            if (r3 == r5) goto L65
            java.lang.String r3 = ", "
            r8.append(r3)
        L65:
            r3 = r4
            goto L3d
        L67:
            eِٜٔ r9 = r7.remoteconfig()
            r9.getClass()
            java.lang.String r9 = ")"
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8746e.m2485instanceof(java.lang.StringBuilder, java.util.List, boolean):void");
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m2486interface(InterfaceC8185e interfaceC8185e, StringBuilder sb) {
        AbstractC13656e mo2387e;
        String ads;
        C1577e c1577e = this.ad.signatures;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[19];
        if (!((Boolean) c1577e.ad).booleanValue() || (mo2387e = interfaceC8185e.mo2387e()) == null || (ads = ads(mo2387e)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(loadAd(ads));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String isVip(InterfaceC16566e interfaceC16566e, EnumC13729e enumC13729e) {
        C7283e mo1722e;
        List mo330e;
        C17127e c17127e = this.ad;
        C1577e c1577e = c17127e.f33536try;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (enumC13729e != null) {
            sb.append(enumC13729e.f27208e + ':');
        }
        AbstractC1186e ad = interfaceC16566e.ad();
        sb.append(m2481final(ad));
        InterfaceC8614e[] interfaceC8614eArr = C17127e.f33518strictfp;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[38];
        if (((EnumC12673e) c1577e.ad).f25409e) {
            Map advert = interfaceC16566e.advert();
            C1577e c1577e2 = c17127e.f33534this;
            InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[33];
            C13664e c13664e = null;
            InterfaceC5052e license2 = ((Boolean) c1577e2.ad).booleanValue() ? AbstractC2876e.license(interfaceC16566e) : null;
            if (license2 != null && (mo1722e = license2.mo1722e()) != null && (mo330e = mo1722e.mo330e()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : mo330e) {
                    if (((C13043e) obj).m3525e()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C13043e) it.next()).getName());
                }
                c13664e = arrayList2;
            }
            if (c13664e == null) {
                c13664e = C13664e.f27089e;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : c13664e) {
                if (!advert.containsKey((C0520e) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC0746e.subscription(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C0520e) it2.next()).vip() + " = ...");
            }
            Set<Map.Entry> entrySet = advert.entrySet();
            ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(entrySet, 10));
            for (Map.Entry entry : entrySet) {
                C0520e c0520e = (C0520e) entry.getKey();
                AbstractC13656e abstractC13656e = (AbstractC13656e) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c0520e.vip());
                sb2.append(" = ");
                sb2.append(!c13664e.contains(c0520e) ? ads(abstractC13656e) : "...");
                arrayList5.add(sb2.toString());
            }
            List m3598return = AbstractC13480e.m3598return(AbstractC13480e.m3584final(arrayList4, arrayList5));
            InterfaceC8614e interfaceC8614e3 = C17127e.f33518strictfp[38];
            if (((EnumC12673e) c1577e.ad).f25408e || !m3598return.isEmpty()) {
                AbstractC13480e.m3610while(m3598return, sb, ", ", "(", ")", null, 112);
            }
        }
        if (pro() && (AbstractC4520e.purchase(ad) || (ad.loadAd().advert() instanceof C5572e))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC11934e
    public final void license(Set set) {
        this.ad.license(set);
    }

    public final String loadAd(String str) {
        return subscription().ad(str);
    }

    @Override // defpackage.InterfaceC11934e
    public final void metrica() {
        this.ad.metrica();
    }

    @Override // defpackage.InterfaceC11934e
    public final Set mopub() {
        return this.ad.mopub();
    }

    /* renamed from: native, reason: not valid java name */
    public final void m2487native(InterfaceC17577e interfaceC17577e, StringBuilder sb) {
        m2500while(sb, interfaceC17577e.mo466e(), "external");
        boolean z = false;
        m2500while(sb, Signature().contains(EnumC7095e.EXPECT) && interfaceC17577e.mo1942e(), "expect");
        if (Signature().contains(EnumC7095e.ACTUAL) && interfaceC17577e.mo1941e()) {
            z = true;
        }
        m2500while(sb, z, "actual");
    }

    /* renamed from: new, reason: not valid java name */
    public final String m2488new(InterfaceC5021e interfaceC5021e) {
        InterfaceC4077e advert = interfaceC5021e.advert();
        if ((advert instanceof InterfaceC16046e) || (advert instanceof InterfaceC5052e) || (advert instanceof InterfaceC9794e)) {
            if (C18139e.appmetrica(advert)) {
                return advert.mo1459goto().toString();
            }
            C1577e c1577e = this.ad.vip;
            InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[0];
            return ((InterfaceC3810e) c1577e.ad).ad(advert, this);
        }
        if (advert == null) {
            return interfaceC5021e instanceof C14376e ? ((C14376e) interfaceC5021e).metrica(C7247e.f14817e) : interfaceC5021e.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + advert.getClass()).toString());
    }

    /* renamed from: package, reason: not valid java name */
    public final void m2489package(StringBuilder sb, List list, boolean z) {
        C1577e c1577e = this.ad.isVip;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[21];
        if (((Boolean) c1577e.ad).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(loadAd("<"));
        m2490private(sb, list);
        sb.append(loadAd(">"));
        if (z) {
            sb.append(" ");
        }
    }

    public final void premium(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            sb.append(m2478class(((C16169e) it.next()).ad(), true));
            if (i == AbstractC6874e.billing(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* renamed from: private, reason: not valid java name */
    public final void m2490private(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m2493strictfp((InterfaceC16046e) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final boolean pro() {
        C1577e c1577e = this.ad.adcel;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[8];
        return ((Boolean) c1577e.ad).booleanValue();
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m2491protected(InterfaceC15498e interfaceC15498e, StringBuilder sb, boolean z) {
        sb.append(m2499try(interfaceC15498e.getName(), z));
    }

    @Override // defpackage.InterfaceC11934e
    public final void purchase() {
        this.ad.purchase();
    }

    public final C14663e remoteconfig() {
        C1577e c1577e = this.ad.subs;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[27];
        return (C14663e) c1577e.ad;
    }

    @Override // defpackage.InterfaceC11934e
    public final void smaato() {
        this.ad.smaato();
    }

    @Override // defpackage.InterfaceC11934e
    public final void startapp() {
        this.ad.startapp();
    }

    /* renamed from: static, reason: not valid java name */
    public final boolean m2492static(C8268e c8268e, StringBuilder sb) {
        if (!Signature().contains(EnumC7095e.VISIBILITY)) {
            return false;
        }
        C17127e c17127e = this.ad;
        C1577e c1577e = c17127e.amazon;
        InterfaceC8614e[] interfaceC8614eArr = C17127e.f33518strictfp;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[12];
        if (((Boolean) c1577e.ad).booleanValue()) {
            c8268e = AbstractC6050e.purchase(c8268e.ad.remoteconfig());
        }
        C1577e c1577e2 = c17127e.loadAd;
        InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[13];
        if (!((Boolean) c1577e2.ad).booleanValue() && AbstractC7890e.billing(c8268e, AbstractC6050e.adcel)) {
            return false;
        }
        sb.append(m2482goto(c8268e.ad.billing()));
        sb.append(" ");
        return true;
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m2493strictfp(InterfaceC16046e interfaceC16046e, StringBuilder sb, boolean z) {
        String str;
        if (z) {
            sb.append(loadAd("<"));
        }
        if (pro()) {
            sb.append("/*");
            sb.append(interfaceC16046e.getIndex());
            sb.append("*/ ");
        }
        m2500while(sb, interfaceC16046e.mo2739e(), "reified");
        int mo2738e = interfaceC16046e.mo2738e();
        if (mo2738e == 1) {
            str = BuildConfig.FLAVOR;
        } else if (mo2738e == 2) {
            str = "in";
        } else {
            if (mo2738e != 3) {
                throw null;
            }
            str = "out";
        }
        boolean z2 = true;
        m2500while(sb, str.length() > 0, str);
        inmobi(sb, interfaceC16046e, null);
        m2491protected(interfaceC16046e, sb, z);
        int size = interfaceC16046e.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            AbstractC1186e abstractC1186e = (AbstractC1186e) interfaceC16046e.getUpperBounds().iterator().next();
            if (abstractC1186e == null) {
                AbstractC13270e.ad(141);
                throw null;
            }
            if (!AbstractC13270e.inmobi(abstractC1186e) || !abstractC1186e.Signature()) {
                sb.append(" : ");
                sb.append(m2481final(abstractC1186e));
            }
        } else if (z) {
            for (AbstractC1186e abstractC1186e2 : interfaceC16046e.getUpperBounds()) {
                if (abstractC1186e2 == null) {
                    AbstractC13270e.ad(141);
                    throw null;
                }
                if (!AbstractC13270e.inmobi(abstractC1186e2) || !abstractC1186e2.Signature()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(m2481final(abstractC1186e2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(loadAd(">"));
        }
    }

    public final void subs(StringBuilder sb, AbstractC10226e abstractC10226e) {
        inmobi(sb, abstractC10226e, null);
        if (AbstractC4520e.purchase(abstractC10226e)) {
            boolean z = abstractC10226e instanceof C3267e;
            C17127e c17127e = this.ad;
            if (z && ((C3267e) abstractC10226e).f7419e.f32934e) {
                C1577e c1577e = c17127e.f33526final;
                InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[47];
                if (((Boolean) c1577e.ad).booleanValue()) {
                    C18139e c18139e = C18139e.ad;
                    if (z) {
                        boolean z2 = ((C3267e) abstractC10226e).f7419e.f32934e;
                    }
                    sb.append(crashlytics(((C0559e) abstractC10226e.loadAd()).f2736e[0]));
                }
            }
            if (z) {
                C1577e c1577e2 = c17127e.f33531new;
                InterfaceC8614e interfaceC8614e2 = C17127e.f33518strictfp[49];
                if (!((Boolean) c1577e2.ad).booleanValue()) {
                    sb.append(((C3267e) abstractC10226e).f7418e);
                    sb.append(m2494super(abstractC10226e.mopub()));
                }
            }
            sb.append(abstractC10226e.loadAd().toString());
            sb.append(m2494super(abstractC10226e.mopub()));
        } else {
            InterfaceC5021e loadAd = abstractC10226e.loadAd();
            InterfaceC4077e advert = abstractC10226e.loadAd().advert();
            C0909e metrica2 = AbstractC8439e.metrica(abstractC10226e, advert instanceof InterfaceC2978e ? (InterfaceC2978e) advert : null, 0);
            if (metrica2 == null) {
                sb.append(m2488new(loadAd));
                sb.append(m2494super(abstractC10226e.mopub()));
            } else {
                m2483implements(sb, metrica2);
            }
            Unit unit = Unit.INSTANCE;
        }
        if (abstractC10226e.Signature()) {
            sb.append("?");
        }
        if (abstractC10226e instanceof C12519e) {
            sb.append(" & Any");
        }
    }

    public final EnumC7201e subscription() {
        C1577e c1577e = this.ad.crashlytics;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[28];
        return (EnumC7201e) c1577e.ad;
    }

    /* renamed from: super, reason: not valid java name */
    public final String m2494super(List list) {
        if (list.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(loadAd("<"));
        AbstractC13480e.m3610while(list, sb, ", ", null, null, new C7007e(this, 0), 60);
        sb.append(loadAd(">"));
        return sb.toString();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m2495synchronized(StringBuilder sb, List list) {
        C1577e c1577e = this.ad.isVip;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[21];
        if (((Boolean) c1577e.ad).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC16046e interfaceC16046e = (InterfaceC16046e) it.next();
            Iterator it2 = AbstractC13480e.subs(1, interfaceC16046e.getUpperBounds()).iterator();
            while (it2.hasNext()) {
                arrayList.add(m2499try(interfaceC16046e.getName(), false) + " : " + m2481final((AbstractC1186e) it2.next()));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m2482goto("where"));
        sb.append(" ");
        AbstractC13480e.m3610while(arrayList, sb, ", ", null, null, null, 124);
    }

    public final String tapsense(InterfaceC15498e interfaceC15498e) {
        InterfaceC15498e mo1351switch;
        String str;
        StringBuilder sb = new StringBuilder();
        interfaceC15498e.mo758e(new C0444e(this), sb);
        C17127e c17127e = this.ad;
        C1577e c1577e = c17127e.metrica;
        InterfaceC8614e[] interfaceC8614eArr = C17127e.f33518strictfp;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[1];
        if (((Boolean) c1577e.ad).booleanValue() && !(interfaceC15498e instanceof InterfaceC9646e) && !(interfaceC15498e instanceof InterfaceC11348e) && (mo1351switch = interfaceC15498e.mo1351switch()) != null && !(mo1351switch instanceof InterfaceC5334e)) {
            sb.append(" ");
            int ordinal = subscription().ordinal();
            if (ordinal == 0) {
                str = "defined in";
            } else {
                if (ordinal != 1) {
                    throw new C14803e(10);
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            C13579e purchase = AbstractC14300e.purchase(mo1351switch);
            sb.append(purchase.metrica() ? "root package" : loadAd(AbstractC10681e.startapp(C13579e.purchase(purchase))));
            C1577e c1577e2 = c17127e.license;
            InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[2];
            if (((Boolean) c1577e2.ad).booleanValue() && (mo1351switch instanceof InterfaceC9646e) && (interfaceC15498e instanceof InterfaceC7573e)) {
                ((InterfaceC7573e) interfaceC15498e).adcel().getClass();
            }
        }
        return sb.toString();
    }

    /* renamed from: this, reason: not valid java name */
    public final void m2496this(InterfaceC0390e interfaceC0390e, StringBuilder sb) {
        String str;
        if (Signature().contains(EnumC7095e.MEMBER_KIND) && pro() && interfaceC0390e.mo334e() != 1) {
            sb.append("/*");
            int mo334e = interfaceC0390e.mo334e();
            if (mo334e == 1) {
                str = "DECLARATION";
            } else if (mo334e == 2) {
                str = "FAKE_OVERRIDE";
            } else if (mo334e == 3) {
                str = "DELEGATION";
            } else {
                if (mo334e != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(AbstractC6022e.startapp(str));
            sb.append("*/ ");
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m2497throw(InterfaceC0390e interfaceC0390e, StringBuilder sb) {
        if (AbstractC14300e.admob(interfaceC0390e) && interfaceC0390e.mo1718extends() == 1) {
            return;
        }
        C1577e c1577e = this.ad.premium;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[26];
        if (((EnumC12498e) c1577e.ad) == EnumC12498e.f25030e && interfaceC0390e.mo1718extends() == 3 && !interfaceC0390e.mo337finally().isEmpty()) {
            return;
        }
        m2480extends(interfaceC0390e.mo1718extends(), signatures(interfaceC0390e), sb);
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m2498transient(InterfaceC8185e interfaceC8185e, StringBuilder sb, boolean z) {
        if (z || !(interfaceC8185e instanceof C13043e)) {
            sb.append(m2482goto(interfaceC8185e.mo2386e() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* renamed from: try, reason: not valid java name */
    public final String m2499try(C0520e c0520e, boolean z) {
        String loadAd = loadAd(AbstractC10681e.billing(c0520e));
        C1577e c1577e = this.ad.f33533super;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[48];
        return (((Boolean) c1577e.ad).booleanValue() && subscription() == EnumC7201e.f14709e && z) ? AbstractC5087e.m1746extends("<b>", loadAd, "</b>") : loadAd;
    }

    @Override // defpackage.InterfaceC11934e
    public final void vip() {
        this.ad.vip();
    }

    /* renamed from: while, reason: not valid java name */
    public final void m2500while(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m2482goto(str));
            sb.append(" ");
        }
    }

    @Override // defpackage.InterfaceC11934e
    public final void yandex(EnumC7280e enumC7280e) {
        this.ad.yandex(enumC7280e);
    }
}
