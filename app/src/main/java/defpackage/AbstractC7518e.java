package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۡٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7518e {
    public static final C2892e ad = new C2892e(22925072, false, new C16015e(5));
    public static final String[] vip = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] metrica = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] license = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.Csuper Signature(java.lang.String r8) {
        /*
            java.lang.String r0 = "HTTP/1."
            r1 = 0
            boolean r0 = defpackage.AbstractC6507e.pro(r8, r0, r1)
            r2 = 4
            eّٔؕ r3 = defpackage.EnumC12473e.HTTP_1_0
            eّٔؕ r4 = defpackage.EnumC12473e.HTTP_1_1
            r5 = 32
            java.lang.String r6 = "Unexpected status line: "
            if (r0 == 0) goto L43
            int r0 = r8.length()
            r1 = 9
            if (r0 < r1) goto L39
            r0 = 8
            char r0 = r8.charAt(r0)
            if (r0 != r5) goto L39
            r0 = 7
            char r0 = r8.charAt(r0)
            int r0 = r0 + (-48)
            if (r0 == 0) goto L58
            r3 = 1
            if (r0 != r3) goto L2f
            goto L57
        L2f:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L39:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L43:
            java.lang.String r0 = "ICY "
            boolean r0 = defpackage.AbstractC6507e.pro(r8, r0, r1)
            if (r0 == 0) goto L4d
            r1 = r2
            goto L58
        L4d:
            java.lang.String r0 = "SOURCETABLE "
            boolean r0 = defpackage.AbstractC6507e.pro(r8, r0, r1)
            if (r0 == 0) goto La8
            r1 = 12
        L57:
            r3 = r4
        L58:
            int r0 = r8.length()
            int r4 = r1 + 3
            if (r0 < r4) goto L9e
            java.lang.String r0 = r8.substring(r1, r4)
            java.lang.Integer r0 = defpackage.AbstractC6507e.signatures(r0)
            if (r0 == 0) goto L94
            int r0 = r0.intValue()
            int r7 = r8.length()
            if (r7 <= r4) goto L8a
            char r4 = r8.charAt(r4)
            if (r4 != r5) goto L80
            int r1 = r1 + r2
            java.lang.String r8 = r8.substring(r1)
            goto L8c
        L80:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L8a:
            java.lang.String r8 = ""
        L8c:
            super r1 = new super
            r2 = 28
            r1.<init>(r3, r0, r8, r2)
            return r1
        L94:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        L9e:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        La8:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r8 = r6.concat(r8)
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7518e.Signature(java.lang.String):super");
    }

    public static /* synthetic */ void ad(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case 31:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[0] = "enumClass";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                objArr[2] = "isEnumValuesMethod";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static C2042e adcel(InterfaceC2188e interfaceC2188e, InterfaceC2460e interfaceC2460e, InterfaceC2460e interfaceC2460e2, boolean z, C8268e c8268e, InterfaceC3054e interfaceC3054e) {
        if (interfaceC2460e == null) {
            ad(8);
            throw null;
        }
        if (interfaceC2460e2 == null) {
            ad(9);
            throw null;
        }
        if (c8268e == null) {
            ad(10);
            throw null;
        }
        if (interfaceC3054e == null) {
            ad(11);
            throw null;
        }
        C2042e c2042e = new C2042e(interfaceC2188e, interfaceC2460e, interfaceC2188e.mo1718extends(), c8268e, z, false, false, 1, null, interfaceC3054e);
        c2042e.f5322e = C2042e.m755e(c2042e, interfaceC2188e.ad(), interfaceC2460e2);
        return c2042e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C3318e admob(java.lang.String r19) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = defpackage.AbstractC4465e.startapp(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld0
            eؓۢٔ r2 = defpackage.AbstractC17475e.f34223e
            eؒۢۗ r2 = defpackage.C1410e.f4222e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = defpackage.AbstractC4465e.startapp(r0, r8)
            if (r8 == 0) goto L9b
            r2 = 0
            r6 = r2
        L35:
            r7 = 4
            if (r6 >= r7) goto Lc8
            java.lang.String[] r8 = defpackage.AbstractC7518e.vip
            r8 = r8[r6]
            java.lang.String r8 = defpackage.AbstractC4465e.billing(r0, r8)
            if (r8 == 0) goto L98
            int r6 = java.lang.Integer.parseInt(r8)
            r8 = 1
            if (r6 != r8) goto Lc8
            r6 = r2
        L4a:
            if (r6 >= r7) goto L60
            java.lang.String[] r8 = defpackage.AbstractC7518e.metrica
            r8 = r8[r6]
            java.lang.String r8 = defpackage.AbstractC4465e.billing(r0, r8)
            if (r8 == 0) goto L62
            long r6 = java.lang.Long.parseLong(r8)
            r8 = -1
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L65
        L60:
            r6 = r4
            goto L65
        L62:
            int r6 = r6 + 1
            goto L4a
        L65:
            r8 = 2
            if (r2 >= r8) goto L93
            java.lang.String[] r8 = defpackage.AbstractC7518e.license
            r8 = r8[r2]
            java.lang.String r8 = defpackage.AbstractC4465e.billing(r0, r8)
            if (r8 == 0) goto L90
            long r11 = java.lang.Long.parseLong(r8)
            eؑۜٗ r13 = new eؑۜٗ
            r15 = 0
            r17 = 0
            java.lang.String r14 = "image/jpeg"
            r13.<init>(r14, r15, r17)
            r2 = r13
            eؑۜٗ r9 = new eؑۜٗ
            java.lang.String r10 = "video/mp4"
            r13 = 0
            r9.<init>(r10, r11, r13)
            eؒۢۗ r2 = defpackage.AbstractC17475e.premium(r2, r9)
            goto Lbc
        L90:
            int r2 = r2 + 1
            goto L65
        L93:
            eؓۢٔ r2 = defpackage.AbstractC17475e.f34223e
            eؒۢۗ r2 = defpackage.C1410e.f4222e
            goto Lbc
        L98:
            int r6 = r6 + 1
            goto L35
        L9b:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = defpackage.AbstractC4465e.startapp(r0, r8)
            if (r8 == 0) goto Lac
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            eؒۢۗ r2 = subscription(r0, r2, r8)
            goto Lbc
        Lac:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = defpackage.AbstractC4465e.startapp(r0, r8)
            if (r8 == 0) goto Lbc
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            eؒۢۗ r2 = subscription(r0, r2, r8)
        Lbc:
            boolean r8 = defpackage.AbstractC4465e.yandex(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc9
        Lc8:
            return r3
        Lc9:
            eّؕؕ r0 = new eّؕؕ
            r1 = 3
            r0.<init>(r6, r2, r1)
            return r0
        Ld0:
            java.lang.String r0 = "Couldn't find xmp metadata"
            eٔۧۤ r0 = defpackage.C15125e.ad(r3, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7518e.admob(java.lang.String):eّؕؕ");
    }

    public static final float[] advert(float f, float f2, float f3, float[] fArr) {
        return new float[]{fArr[0] * f, fArr[1] * f2, fArr[2] * f3, fArr[3] * f, fArr[4] * f2, fArr[5] * f3, fArr[6] * f, fArr[7] * f2, fArr[8] * f3};
    }

    public static float[] amazon(float[] fArr) {
        double d = fArr[0];
        double d2 = fArr[1];
        double d3 = fArr[2];
        double d4 = fArr[3];
        double d5 = fArr[4];
        double d6 = fArr[5];
        double d7 = fArr[6];
        double d8 = fArr[7];
        double d9 = fArr[8];
        double d10 = (d5 * d9) - (d8 * d6);
        double d11 = (d8 * d3) - (d2 * d9);
        double d12 = (d2 * d6) - (d5 * d3);
        double d13 = (d7 * d12) + (d4 * d11) + (d * d10);
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        copyOf[0] = (float) (d10 / d13);
        copyOf[3] = (float) (((d7 * d6) - (d4 * d9)) / d13);
        copyOf[6] = (float) (((d4 * d8) - (d7 * d5)) / d13);
        copyOf[1] = (float) (d11 / d13);
        copyOf[4] = (float) (((d9 * d) - (d7 * d3)) / d13);
        copyOf[7] = (float) (((d7 * d2) - (d8 * d)) / d13);
        copyOf[2] = (float) (d12 / d13);
        copyOf[5] = (float) (((d4 * d3) - (d * d6)) / d13);
        copyOf[8] = (float) (((d * d5) - (d4 * d2)) / d13);
        return copyOf;
    }

    public static C10162e appmetrica(AbstractC15349e abstractC15349e) {
        if (abstractC15349e == null) {
            ad(26);
            throw null;
        }
        InterfaceC5334e metrica2 = AbstractC14300e.metrica(abstractC15349e);
        InterfaceC5052e license2 = AbstractC1284e.license(metrica2, C12269e.inmobi);
        if (license2 == null) {
            return null;
        }
        C11064e c11064e = C4590e.f9885e;
        C8268e c8268e = AbstractC6050e.appmetrica;
        C10162e m2777e = C10162e.m2777e(abstractC15349e, 1, false, AbstractC4972e.vip, 4, abstractC15349e.adcel());
        C7901e c7901e = new C7901e(m2777e, c11064e, 1, c8268e, false, false, false, 4, null, abstractC15349e.adcel());
        m2777e.m2780e(c7901e, null, null, null);
        C6557e.f13492e.getClass();
        AbstractC10226e license3 = AbstractC1596e.license(C6557e.f13491e, license2.mo1459goto(), Collections.singletonList(new C7878e(1, abstractC15349e.mo1458e())), false);
        List list = Collections.EMPTY_LIST;
        m2777e.m2781e(license3, list, null, null, list);
        c7901e.m2354e(m2777e.inmobi());
        return m2777e;
    }

    public static C1117e billing(AbstractC15349e abstractC15349e) {
        if (abstractC15349e == null) {
            ad(22);
            throw null;
        }
        C1117e m467e = C1117e.m467e(abstractC15349e, AbstractC4972e.ad, 4, abstractC15349e.adcel());
        List list = Collections.EMPTY_LIST;
        return m467e.mo470e(null, null, list, list, list, AbstractC2876e.appmetrica(abstractC15349e).startapp(abstractC15349e.mo1458e()), 1, AbstractC6050e.appmetrica);
    }

    public static C2042e license(InterfaceC2188e interfaceC2188e, InterfaceC2460e interfaceC2460e) {
        C11064e c11064e = C4590e.f9885e;
        InterfaceC3054e adcel = interfaceC2188e.adcel();
        if (adcel != null) {
            return adcel(interfaceC2188e, interfaceC2460e, c11064e, true, interfaceC2188e.advert(), adcel);
        }
        ad(6);
        throw null;
    }

    public static boolean loadAd(InterfaceC16528e interfaceC16528e) {
        return interfaceC16528e.mo334e() == 4 && AbstractC14300e.advert(interfaceC16528e.mo1351switch(), 3);
    }

    public static C7901e metrica(InterfaceC2188e interfaceC2188e, InterfaceC2460e interfaceC2460e) {
        return startapp(interfaceC2188e, interfaceC2460e, true, interfaceC2188e.adcel());
    }

    public static final float[] mopub(float f, float f2, float f3, float[] fArr) {
        return new float[]{(fArr[2] * f3) + (fArr[1] * f2) + (fArr[0] * f), (fArr[5] * f3) + (fArr[4] * f2) + (fArr[3] * f), (fArr[8] * f3) + (fArr[7] * f2) + (fArr[6] * f)};
    }

    public static C1117e purchase(AbstractC15349e abstractC15349e) {
        if (abstractC15349e == null) {
            ad(24);
            throw null;
        }
        C11064e c11064e = C4590e.f9885e;
        C1117e m467e = C1117e.m467e(abstractC15349e, AbstractC4972e.metrica, 4, abstractC15349e.adcel());
        C13043e c13043e = new C13043e(m467e, null, 0, c11064e, C0520e.appmetrica("value"), AbstractC2876e.appmetrica(abstractC15349e).signatures(), false, false, false, null, abstractC15349e.adcel());
        List list = Collections.EMPTY_LIST;
        return m467e.mo470e(null, null, list, list, Collections.singletonList(c13043e), abstractC15349e.mo1458e(), 1, AbstractC6050e.appmetrica);
    }

    public static final float smaato(int i, int i2, float[] fArr, float[] fArr2) {
        int i3 = i2 * 3;
        return (fArr[i3 + 2] * fArr2[6 + i]) + (fArr[i3 + 1] * fArr2[3 + i]) + (fArr2[i] * fArr[i3]);
    }

    public static C7901e startapp(InterfaceC2188e interfaceC2188e, InterfaceC2460e interfaceC2460e, boolean z, InterfaceC3054e interfaceC3054e) {
        if (interfaceC2460e == null) {
            ad(18);
            throw null;
        }
        if (interfaceC3054e != null) {
            return new C7901e(interfaceC2188e, interfaceC2460e, interfaceC2188e.mo1718extends(), interfaceC2188e.advert(), z, false, false, 1, null, interfaceC3054e);
        }
        ad(19);
        throw null;
    }

    public static C1410e subscription(XmlPullParser xmlPullParser, String str, String str2) {
        C13304e Signature = AbstractC17475e.Signature();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC4465e.startapp(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String billing = AbstractC4465e.billing(xmlPullParser, concat3);
                String billing2 = AbstractC4465e.billing(xmlPullParser, concat4);
                String billing3 = AbstractC4465e.billing(xmlPullParser, concat5);
                String billing4 = AbstractC4465e.billing(xmlPullParser, concat6);
                if (billing == null || billing2 == null) {
                    return C1410e.f4222e;
                }
                Signature.metrica(new C0574e(billing, billing3 != null ? Long.parseLong(billing3) : 0L, billing4 != null ? Long.parseLong(billing4) : 0L));
            }
        } while (!AbstractC4465e.yandex(xmlPullParser, concat2));
        return Signature.billing();
    }

    public static C16169e vip(InterfaceC6647e interfaceC6647e, AbstractC1186e abstractC1186e, C0520e c0520e, InterfaceC2460e interfaceC2460e, int i) {
        if (interfaceC6647e == null) {
            ad(32);
            throw null;
        }
        if (interfaceC2460e == null) {
            ad(33);
            throw null;
        }
        if (abstractC1186e == null) {
            return null;
        }
        C12990e c12990e = new C12990e(interfaceC6647e, abstractC1186e, c0520e, 1);
        C10445e c10445e = AbstractC0757e.ad;
        return new C16169e(interfaceC6647e, c12990e, interfaceC2460e, C0520e.appmetrica(AbstractC0757e.vip + '_' + i));
    }

    public static C16169e yandex(InterfaceC6647e interfaceC6647e, AbstractC1186e abstractC1186e, InterfaceC2460e interfaceC2460e) {
        if (abstractC1186e == null) {
            return null;
        }
        return new C16169e(interfaceC6647e, new C13914e(interfaceC6647e, abstractC1186e), interfaceC2460e);
    }
}
