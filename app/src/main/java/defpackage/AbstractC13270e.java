package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕٔ */
/* loaded from: classes3.dex */
public abstract class AbstractC13270e {
    public static final C0520e appmetrica = C0520e.billing("<built-ins module>");
    public C16113e ad;
    public final C6272e license;
    public final C1159e metrica;
    public final C0394e vip;

    /* JADX WARN: Type inference failed for: r1v2, types: [eٖؑٚ, eٖۥٌ] */
    public AbstractC13270e(C6272e c6272e) {
        this.license = c6272e;
        c6272e.ad(new C2263e(this, 0));
        this.vip = new C16622e(c6272e, new C2263e(this, 1));
        this.metrica = c6272e.vip(new C13171e(this, 1));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:141:0x0419. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:142:0x041c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:143:0x041f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void ad(int r23) {
        /*
            Method dump skipped, instructions count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13270e.ad(int):void");
    }

    public static boolean ads(AbstractC1186e abstractC1186e, C13579e c13579e) {
        if (abstractC1186e == null) {
            ad(97);
            throw null;
        }
        if (c13579e != null) {
            return m3537goto(abstractC1186e.loadAd(), c13579e);
        }
        ad(98);
        throw null;
    }

    public static boolean applovin(InterfaceC15498e interfaceC15498e) {
        if (interfaceC15498e != null) {
            return AbstractC14300e.yandex(interfaceC15498e, C4718e.class, false) != null;
        }
        ad(9);
        throw null;
    }

    /* renamed from: class */
    public static boolean m3536class(AbstractC1186e abstractC1186e) {
        if (abstractC1186e == null) {
            ad(94);
            throw null;
        }
        if (abstractC1186e.Signature()) {
            return false;
        }
        InterfaceC4077e advert = abstractC1186e.loadAd().advert();
        return (advert instanceof InterfaceC5052e) && pro((InterfaceC5052e) advert) != null;
    }

    public static boolean crashlytics(AbstractC1186e abstractC1186e, C13579e c13579e) {
        if (abstractC1186e == null) {
            ad(105);
            throw null;
        }
        if (c13579e != null) {
            return !abstractC1186e.Signature() && ads(abstractC1186e, c13579e);
        }
        ad(106);
        throw null;
    }

    public static boolean firebase(AbstractC1186e abstractC1186e) {
        if (abstractC1186e != null) {
            return ads(abstractC1186e, AbstractC0206e.vip) && !AbstractC11957e.appmetrica(abstractC1186e);
        }
        ad(136);
        throw null;
    }

    /* renamed from: goto */
    public static boolean m3537goto(InterfaceC5021e interfaceC5021e, C13579e c13579e) {
        if (interfaceC5021e == null) {
            ad(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
            throw null;
        }
        if (c13579e != null) {
            InterfaceC4077e advert = interfaceC5021e.advert();
            return (advert instanceof InterfaceC5052e) && vip((InterfaceC5052e) advert, c13579e);
        }
        ad(102);
        throw null;
    }

    public static boolean inmobi(AbstractC1186e abstractC1186e) {
        if (abstractC1186e != null) {
            return ads(abstractC1186e, AbstractC0206e.ad);
        }
        ad(139);
        throw null;
    }

    /* renamed from: interface */
    public static boolean m3538interface(AbstractC1186e abstractC1186e) {
        return crashlytics(abstractC1186e, AbstractC0206e.purchase);
    }

    public static boolean isPro(AbstractC1186e abstractC1186e) {
        if (abstractC1186e != null) {
            return ads(abstractC1186e, AbstractC0206e.billing);
        }
        ad(88);
        throw null;
    }

    public static boolean premium(AbstractC1186e abstractC1186e, C13579e c13579e) {
        if (c13579e != null) {
            return ads(abstractC1186e, c13579e) && !abstractC1186e.Signature();
        }
        ad(135);
        throw null;
    }

    public static EnumC3702e pro(InterfaceC5052e interfaceC5052e) {
        if (interfaceC5052e == null) {
            ad(76);
            throw null;
        }
        if (AbstractC0206e.f1440instanceof.contains(interfaceC5052e.getName())) {
            return (EnumC3702e) AbstractC0206e.f1451synchronized.get(AbstractC14300e.purchase(interfaceC5052e));
        }
        return null;
    }

    public static boolean subs(InterfaceC16528e interfaceC16528e) {
        if (interfaceC16528e == null) {
            ad(160);
            throw null;
        }
        if (interfaceC16528e.vip().getAnnotations().amazon(AbstractC0206e.smaato)) {
            return true;
        }
        if (!(interfaceC16528e instanceof InterfaceC2188e)) {
            return false;
        }
        InterfaceC2188e interfaceC2188e = (InterfaceC2188e) interfaceC16528e;
        boolean mo2386e = interfaceC2188e.mo2386e();
        C7901e metrica = interfaceC2188e.metrica();
        C2042e appmetrica2 = interfaceC2188e.appmetrica();
        if (metrica == null || !subs(metrica)) {
            return false;
        }
        if (mo2386e) {
            return appmetrica2 != null && subs(appmetrica2);
        }
        return true;
    }

    public static EnumC3702e subscription(InterfaceC4077e interfaceC4077e) {
        if (interfaceC4077e == null) {
            ad(77);
            throw null;
        }
        if (AbstractC0206e.f1448static.contains(interfaceC4077e.getName())) {
            return (EnumC3702e) AbstractC0206e.f1447return.get(AbstractC14300e.purchase(interfaceC4077e));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r1 = r1;
     */
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m3539this(defpackage.InterfaceC4077e r1) {
        /*
            if (r1 == 0) goto L1e
        L2:
            if (r1 == 0) goto L1c
            boolean r0 = r1 instanceof defpackage.InterfaceC9646e
            if (r0 == 0) goto L17
            eٍؚٟ r1 = (defpackage.InterfaceC9646e) r1
            eۣٔۙ r1 = (defpackage.AbstractC14941e) r1
            eّۡۜ r1 = r1.f29618e
            eؑۘٛ r0 = defpackage.AbstractC4972e.adcel
            eْۢٙ r1 = r1.ad
            boolean r1 = r1.yandex(r0)
            return r1
        L17:
            eِٕٖ r1 = r1.mo1351switch()
            goto L2
        L1c:
            r1 = 0
            return r1
        L1e:
            r1 = 10
            ad(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13270e.m3539this(eْؖٝ):boolean");
    }

    public static boolean vip(InterfaceC5052e interfaceC5052e, C13579e c13579e) {
        if (interfaceC5052e == null) {
            ad(103);
            throw null;
        }
        if (c13579e != null) {
            return interfaceC5052e.getName().equals(c13579e.billing()) && c13579e.equals(AbstractC14300e.purchase(interfaceC5052e));
        }
        ad(104);
        throw null;
    }

    public InterfaceC2684e Signature() {
        return C5438e.f11694e;
    }

    public final InterfaceC5052e adcel(C12816e c12816e) {
        if (c12816e == null) {
            ad(12);
            throw null;
        }
        InterfaceC5052e billing = AbstractC8797e.billing(advert(), c12816e);
        if (billing != null) {
            return billing;
        }
        ad(13);
        throw null;
    }

    public final AbstractC10226e admob(EnumC3702e enumC3702e) {
        if (enumC3702e == null) {
            ad(73);
            throw null;
        }
        AbstractC10226e abstractC10226e = (AbstractC10226e) ((C16752e) this.vip.invoke()).ad.get(enumC3702e);
        if (abstractC10226e != null) {
            return abstractC10226e;
        }
        ad(74);
        throw null;
    }

    public final C16113e advert() {
        this.ad.getClass();
        C16113e c16113e = this.ad;
        if (c16113e != null) {
            return c16113e;
        }
        ad(7);
        throw null;
    }

    public final AbstractC10226e amazon() {
        AbstractC10226e mo1458e = mopub("Nothing").mo1458e();
        if (mo1458e != null) {
            return mo1458e;
        }
        ad(49);
        throw null;
    }

    public final AbstractC10226e appmetrica() {
        AbstractC10226e mo1458e = mopub("Any").mo1458e();
        if (mo1458e != null) {
            return mo1458e;
        }
        ad(51);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.AbstractC1186e billing(defpackage.AbstractC1186e r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L8d
            boolean r1 = isPro(r5)
            r2 = 0
            if (r1 == 0) goto L26
            java.util.List r1 = r5.mopub()
            int r1 = r1.size()
            r3 = 1
            if (r1 == r3) goto L17
            goto L8c
        L17:
            java.util.List r5 = r5.mopub()
            java.lang.Object r5 = r5.get(r2)
            eٖٕٞ r5 = (defpackage.AbstractC16232e) r5
            eٜؒؒ r5 = r5.vip()
            return r5
        L26:
            eٕۛٙ r5 = defpackage.AbstractC11957e.billing(r5, r2)
            eٖؑٚ r1 = r4.vip
            java.lang.Object r1 = r1.invoke()
            eٗؔۖ r1 = (defpackage.C16752e) r1
            java.util.HashMap r1 = r1.vip
            java.lang.Object r1 = r1.get(r5)
            eٜؒؒ r1 = (defpackage.AbstractC1186e) r1
            if (r1 == 0) goto L3d
            return r1
        L3d:
            int r1 = defpackage.AbstractC14300e.ad
            eٜؗ٘ r1 = r5.loadAd()
            eْؖٝ r1 = r1.advert()
            if (r1 != 0) goto L4b
            r1 = r0
            goto L4f
        L4b:
            eؘؙؐ r1 = defpackage.AbstractC14300e.license(r1)
        L4f:
            if (r1 == 0) goto L8c
            eٜؗ٘ r5 = r5.loadAd()
            eْؖٝ r5 = r5.advert()
            if (r5 != 0) goto L5d
        L5b:
            r5 = r0
            goto L89
        L5d:
            java.util.Set r2 = defpackage.AbstractC8825e.ad
            eؑۘٛ r2 = r5.getName()
            java.util.LinkedHashSet r3 = defpackage.AbstractC8825e.license
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L6c
            goto L5b
        L6c:
            eِْؕ r5 = defpackage.AbstractC2876e.purchase(r5)
            if (r5 != 0) goto L73
            goto L5b
        L73:
            java.util.HashMap r2 = defpackage.AbstractC8825e.vip
            java.lang.Object r5 = r2.get(r5)
            eِْؕ r5 = (defpackage.C11709e) r5
            if (r5 != 0) goto L7e
            goto L5b
        L7e:
            eؗٞؓ r5 = defpackage.AbstractC1284e.license(r1, r5)
            if (r5 != 0) goto L85
            goto L5b
        L85:
            eَْ r5 = r5.mo1458e()
        L89:
            if (r5 == 0) goto L8c
            return r5
        L8c:
            return r0
        L8d:
            r5 = 70
            ad(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13270e.billing(eٜؒؒ):eٜؒؒ");
    }

    public final AbstractC10226e isVip() {
        AbstractC10226e mo1458e = mopub("Unit").mo1458e();
        if (mo1458e != null) {
            return mo1458e;
        }
        ad(65);
        throw null;
    }

    public InterfaceC0020e license() {
        return C6114e.f12850e;
    }

    public final AbstractC10226e loadAd() {
        AbstractC10226e pro = appmetrica().pro(true);
        if (pro != null) {
            return pro;
        }
        ad(52);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, eؕٛؓ] */
    public final void metrica() {
        InputStream inputStream;
        C0520e c0520e = appmetrica;
        C6272e c6272e = this.license;
        C16113e c16113e = new C16113e(c0520e, c6272e, this, 48);
        this.ad = c16113e;
        InterfaceC8359e.ad.getClass();
        InterfaceC8359e interfaceC8359e = (InterfaceC8359e) C5503e.vip.getValue();
        C16113e c16113e2 = this.ad;
        Iterable smaato = smaato();
        InterfaceC2684e Signature = Signature();
        InterfaceC0020e license = license();
        ((C9191e) interfaceC8359e).getClass();
        Set<C12816e> set = AbstractC4972e.admob;
        ArrayList arrayList = new ArrayList();
        for (C12816e c12816e : set) {
            C16810e.smaato.getClass();
            String ad = C16810e.ad(c12816e);
            ClassLoader classLoader = C10990e.class.getClassLoader();
            if (classLoader == null) {
                inputStream = ClassLoader.getSystemResourceAsStream(ad);
            } else {
                URL resource = classLoader.getResource(ad);
                if (resource == null) {
                    inputStream = null;
                } else {
                    URLConnection openConnection = resource.openConnection();
                    openConnection.setUseCaches(false);
                    inputStream = openConnection.getInputStream();
                }
            }
            C4718e vip = inputStream != null ? AbstractC5706e.vip(c12816e, c6272e, c16113e2, inputStream) : null;
            if (vip != null) {
                arrayList.add(vip);
            }
        }
        C16124e c16124e = new C16124e(arrayList);
        C11980e c11980e = new C11980e(c6272e, c16113e2);
        C5389e c5389e = new C5389e(10, c16124e);
        C16810e c16810e = C16810e.smaato;
        C18540e c18540e = new C18540e(c16113e2, c11980e, c16810e);
        C18521e c18521e = c16810e.ad;
        String str = C6272e.license;
        new ConcurrentHashMap(3, 1.0f, 2);
        C18277e c18277e = new C18277e(c6272e, c16113e2, c5389e, c18540e, c16124e, smaato, c11980e, license, Signature, c18521e, null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C4718e) it.next()).m1671e(c18277e);
        }
        c16113e.f31697e = c16124e;
        C16113e c16113e3 = this.ad;
        c16113e3.getClass();
        c16113e3.f31694e = new C9024e(AbstractC1660e.m670implements(new C16113e[]{c16113e3}));
    }

    public final InterfaceC5052e mopub(String str) {
        if (str != null) {
            return (InterfaceC5052e) this.metrica.invoke(C0520e.appmetrica(str));
        }
        ad(14);
        throw null;
    }

    public final AbstractC1186e purchase(AbstractC1186e abstractC1186e) {
        if (abstractC1186e == null) {
            ad(68);
            throw null;
        }
        AbstractC1186e billing = billing(abstractC1186e);
        if (billing != null) {
            return billing;
        }
        throw new IllegalStateException("not array: " + abstractC1186e);
    }

    public final AbstractC10226e remoteconfig(EnumC3702e enumC3702e) {
        if (enumC3702e == null) {
            ad(54);
            throw null;
        }
        AbstractC10226e mo1458e = mopub(enumC3702e.f8288e.vip()).mo1458e();
        if (mo1458e != null) {
            return mo1458e;
        }
        ad(55);
        throw null;
    }

    public final AbstractC10226e signatures() {
        AbstractC10226e mo1458e = mopub("String").mo1458e();
        if (mo1458e != null) {
            return mo1458e;
        }
        ad(66);
        throw null;
    }

    public Iterable smaato() {
        List singletonList = Collections.singletonList(new C3292e(this.license, advert()));
        if (singletonList != null) {
            return singletonList;
        }
        ad(5);
        throw null;
    }

    public final AbstractC10226e startapp(AbstractC1186e abstractC1186e) {
        if (abstractC1186e != null) {
            return yandex(1, abstractC1186e, C4590e.f9885e);
        }
        ad(83);
        throw null;
    }

    public final InterfaceC5052e tapsense(int i) {
        return adcel(AbstractC4972e.purchase.ad(C0520e.appmetrica(C2597e.metrica.vip + i)));
    }

    public final AbstractC10226e yandex(int i, AbstractC1186e abstractC1186e, InterfaceC2460e interfaceC2460e) {
        if (i == 0) {
            ad(78);
            throw null;
        }
        if (abstractC1186e != null) {
            return AbstractC1596e.license(AbstractC1660e.m673protected(interfaceC2460e), mopub("Array").mo1459goto(), Collections.singletonList(new C7878e(i, abstractC1186e)), false);
        }
        ad(79);
        throw null;
    }
}
