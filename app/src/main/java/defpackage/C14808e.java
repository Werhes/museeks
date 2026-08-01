package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔٚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14808e extends AbstractC11069e {
    public final /* synthetic */ int signatures;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14808e() {
        super(3, AbstractC3820e.ad.vip(Void.class), 1, null);
        this.signatures = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14808e(int i, InterfaceC7227e interfaceC7227e, int i2, Object obj, int i3, int i4) {
        super(i, interfaceC7227e, i2, obj, i3);
        this.signatures = i4;
    }

    public static long amazon(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
    }

    public static int smaato(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - 1000000000;
    }

    @Override // defpackage.AbstractC11069e
    public void adcel(C17790e c17790e, int i, Object obj) {
        switch (this.signatures) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c17790e.m4433super(0);
                c17790e.m4433super((i << 3) | AbstractC4653e.signatures(this.license));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj != null) {
                    super.adcel(c17790e, i, obj);
                    return;
                }
                int pro = c17790e.pro();
                billing(c17790e, obj);
                c17790e.m4433super(c17790e.pro() - pro);
                c17790e.m4433super((i << 3) | AbstractC4653e.signatures(this.license));
                return;
            default:
                super.adcel(c17790e, i, obj);
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public int advert(int i, Object obj) {
        switch (this.signatures) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC8141e.startapp(1) + AbstractC8141e.startapp((i << 3) | AbstractC4653e.signatures(1));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj != null) {
                    return super.advert(i, obj);
                }
                int mopub = mopub(obj);
                return AbstractC8141e.startapp(mopub) + AbstractC8141e.startapp((i << 3) | AbstractC4653e.signatures(1)) + mopub;
            default:
                return super.advert(i, obj);
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void billing(C17790e c17790e, Object obj) {
        switch (this.signatures) {
            case 0:
                c17790e.m4428final(Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            case 1:
                c17790e.m4425catch(Float.floatToIntBits(((Number) obj).floatValue()));
                return;
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                c17790e.m4433super(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 4:
                c17790e.m4424case((C0193e) obj);
                return;
            case 5:
                Duration duration = (Duration) obj;
                int smaato = smaato(duration);
                if (smaato != 0) {
                    AbstractC11069e.billing.adcel(c17790e, 2, Integer.valueOf(smaato));
                }
                long amazon = amazon(duration);
                if (amazon != 0) {
                    AbstractC11069e.adcel.adcel(c17790e, 1, Long.valueOf(amazon));
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                c17790e.m4425catch(((Number) obj).intValue());
                return;
            case 8:
                c17790e.m4428final(((Number) obj).longValue());
                return;
            case 9:
                Instant instant = (Instant) obj;
                int nano = instant.getNano();
                if (nano != 0) {
                    AbstractC11069e.billing.adcel(c17790e, 2, Integer.valueOf(nano));
                }
                long epochSecond = instant.getEpochSecond();
                if (epochSecond != 0) {
                    AbstractC11069e.adcel.adcel(c17790e, 1, Long.valueOf(epochSecond));
                    return;
                }
                return;
            case 10:
                int intValue = ((Number) obj).intValue();
                if (intValue >= 0) {
                    c17790e.m4433super(intValue);
                    return;
                } else {
                    c17790e.m4431new(intValue);
                    return;
                }
            case 11:
                c17790e.m4431new(((Number) obj).longValue());
                return;
            case 12:
                int intValue2 = ((Number) obj).intValue();
                c17790e.m4433super((intValue2 >> 31) ^ (intValue2 << 1));
                return;
            case 13:
                long longValue = ((Number) obj).longValue();
                c17790e.m4431new((longValue >> 63) ^ (longValue << 1));
                return;
            case 14:
                String str = (String) obj;
                int length = str.length() - 1;
                while (length >= 0) {
                    int i = length - 1;
                    char charAt = str.charAt(length);
                    if (charAt < 128) {
                        c17790e.m4434this(1);
                        int i2 = c17790e.f34880e;
                        byte[] bArr = (byte[]) c17790e.f34884e;
                        int i3 = i2 - 1;
                        bArr[i3] = (byte) charAt;
                        int max = Math.max(-1, i - i3);
                        int i4 = i3;
                        length = i;
                        while (length > max) {
                            char charAt2 = str.charAt(length);
                            if (charAt2 < 128) {
                                length--;
                                i4--;
                                bArr[i4] = (byte) charAt2;
                            } else {
                                c17790e.f34880e = i4;
                            }
                        }
                        c17790e.f34880e = i4;
                    } else {
                        if (charAt < 2048) {
                            c17790e.m4434this(2);
                            byte[] bArr2 = (byte[]) c17790e.f34884e;
                            int i5 = c17790e.f34880e;
                            int i6 = i5 - 1;
                            c17790e.f34880e = i6;
                            bArr2[i6] = (byte) (128 | (charAt & '?'));
                            int i7 = i5 - 2;
                            c17790e.f34880e = i7;
                            bArr2[i7] = (byte) ((charAt >> 6) | 192);
                        } else if (charAt < 55296 || charAt > 57343) {
                            c17790e.m4434this(3);
                            byte[] bArr3 = (byte[]) c17790e.f34884e;
                            int i8 = c17790e.f34880e;
                            int i9 = i8 - 1;
                            c17790e.f34880e = i9;
                            bArr3[i9] = (byte) ((charAt & '?') | 128);
                            int i10 = i8 - 2;
                            c17790e.f34880e = i10;
                            bArr3[i10] = (byte) (128 | (63 & (charAt >> 6)));
                            int i11 = i8 - 3;
                            c17790e.f34880e = i11;
                            bArr3[i11] = (byte) ((charAt >> '\f') | 224);
                        } else {
                            char charAt3 = i >= 0 ? str.charAt(i) : (char) 65535;
                            if (charAt3 > 56319 || 56320 > charAt || charAt >= 57344) {
                                c17790e.m4434this(1);
                                byte[] bArr4 = (byte[]) c17790e.f34884e;
                                int i12 = c17790e.f34880e - 1;
                                c17790e.f34880e = i12;
                                bArr4[i12] = 63;
                            } else {
                                length -= 2;
                                int i13 = (((charAt3 & 1023) << 10) | (charAt & 1023)) + 65536;
                                c17790e.m4434this(4);
                                byte[] bArr5 = (byte[]) c17790e.f34884e;
                                int i14 = c17790e.f34880e;
                                int i15 = i14 - 1;
                                c17790e.f34880e = i15;
                                bArr5[i15] = (byte) ((i13 & 63) | 128);
                                int i16 = i14 - 2;
                                c17790e.f34880e = i16;
                                bArr5[i16] = (byte) (((i13 >> 6) & 63) | 128);
                                int i17 = i14 - 3;
                                c17790e.f34880e = i17;
                                bArr5[i17] = (byte) (128 | (63 & (i13 >> 12)));
                                int i18 = i14 - 4;
                                c17790e.f34880e = i18;
                                bArr5[i18] = (byte) ((i13 >> 18) | 240);
                            }
                        }
                        length = i;
                    }
                }
                return;
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return;
                }
                for (int size = list.size() - 1; -1 < size; size--) {
                    AbstractC11069e.pro.adcel(c17790e, 1, list.get(size));
                }
                return;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return;
                }
                Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
                AbstractC1660e.m677while(entryArr);
                for (Map.Entry entry : entryArr) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    int pro = c17790e.pro();
                    AbstractC11069e.pro.adcel(c17790e, 2, value);
                    AbstractC11069e.Signature.adcel(c17790e, 1, str2);
                    c17790e.m4433super(c17790e.pro() - pro);
                    c17790e.m4433super(8 | AbstractC4653e.signatures(3));
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c17790e.m4433super(0);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj == null) {
                    AbstractC11069e.remoteconfig.adcel(c17790e, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC11069e.amazon.adcel(c17790e, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    AbstractC11069e.Signature.adcel(c17790e, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC11069e.purchase.adcel(c17790e, 4, obj);
                    return;
                } else if (obj instanceof Map) {
                    AbstractC11069e.admob.adcel(c17790e, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException(AbstractC1634e.advert(obj, "unexpected struct value: "));
                    }
                    AbstractC11069e.subscription.adcel(c17790e, 6, obj);
                    return;
                }
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                c17790e.m4433super(((Number) obj).intValue());
                return;
            default:
                c17790e.m4431new(((Number) obj).longValue());
                return;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0024. Please report as an issue. */
    @Override // defpackage.AbstractC11069e
    public final java.lang.Object metrica(defpackage.C17546e r12) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14808e.metrica(e٘ؕ۠):java.lang.Object");
    }

    @Override // defpackage.AbstractC11069e
    public final int mopub(Object obj) {
        switch (this.signatures) {
            case 0:
                ((Number) obj).doubleValue();
                return 8;
            case 1:
                ((Number) obj).floatValue();
                return 4;
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                ((Boolean) obj).getClass();
                return 1;
            case 4:
                return ((C0193e) obj).license();
            case 5:
                Duration duration = (Duration) obj;
                long amazon = amazon(duration);
                int advert = amazon != 0 ? AbstractC11069e.adcel.advert(1, Long.valueOf(amazon)) : 0;
                int smaato = smaato(duration);
                return smaato != 0 ? AbstractC8647e.signatures(smaato, AbstractC11069e.billing, 2, advert) : advert;
            case 6:
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 4;
            case 8:
                ((Number) obj).longValue();
                return 8;
            case 9:
                Instant instant = (Instant) obj;
                long epochSecond = instant.getEpochSecond();
                int advert2 = epochSecond != 0 ? AbstractC11069e.adcel.advert(1, Long.valueOf(epochSecond)) : 0;
                int nano = instant.getNano();
                return nano != 0 ? AbstractC8647e.signatures(nano, AbstractC11069e.billing, 2, advert2) : advert2;
            case 10:
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    return 10;
                }
                if ((intValue & (-128)) == 0) {
                    return 1;
                }
                if ((intValue & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & intValue) == 0) {
                    return 3;
                }
                return (intValue & (-268435456)) == 0 ? 4 : 5;
            case 11:
                return AbstractC8141e.adcel(((Number) obj).longValue());
            case 12:
                int intValue2 = ((Number) obj).intValue();
                int i = (intValue2 >> 31) ^ (intValue2 << 1);
                if ((i & (-128)) == 0) {
                    return 1;
                }
                if ((i & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & i) == 0) {
                    return 3;
                }
                return (i & (-268435456)) == 0 ? 4 : 5;
            case 13:
                long longValue = ((Number) obj).longValue();
                return AbstractC8141e.adcel((longValue >> 63) ^ (longValue << 1));
            case 14:
                return (int) AbstractC13201e.purchase((String) obj);
            case 15:
                List list = (List) obj;
                int i2 = 0;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        i2 += AbstractC11069e.pro.advert(1, it.next());
                    }
                }
                return i2;
            case 16:
                Map map = (Map) obj;
                int i3 = 0;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        int advert3 = AbstractC11069e.pro.advert(2, entry.getValue()) + AbstractC11069e.Signature.advert(1, (String) entry.getKey());
                        i3 += AbstractC8141e.startapp(advert3) + AbstractC8141e.startapp(8 | AbstractC4653e.signatures(1)) + advert3;
                    }
                }
                return i3;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 1;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj == null) {
                    return AbstractC11069e.remoteconfig.advert(1, obj);
                }
                if (obj instanceof Number) {
                    return AbstractC11069e.amazon.advert(2, Double.valueOf(((Number) obj).doubleValue()));
                }
                if (obj instanceof String) {
                    return AbstractC11069e.Signature.advert(3, obj);
                }
                if (obj instanceof Boolean) {
                    return AbstractC11069e.purchase.advert(4, obj);
                }
                if (obj instanceof Map) {
                    return AbstractC11069e.admob.advert(5, (Map) obj);
                }
                if (obj instanceof List) {
                    return AbstractC11069e.subscription.advert(6, obj);
                }
                throw new IllegalArgumentException(AbstractC1634e.advert(obj, "unexpected struct value: "));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                int intValue3 = ((Number) obj).intValue();
                if ((intValue3 & (-128)) == 0) {
                    return 1;
                }
                if ((intValue3 & (-16384)) == 0) {
                    return 2;
                }
                if (((-2097152) & intValue3) == 0) {
                    return 3;
                }
                return (intValue3 & (-268435456)) == 0 ? 4 : 5;
            default:
                return AbstractC8141e.adcel(((Number) obj).longValue());
        }
    }

    @Override // defpackage.AbstractC11069e
    public final void purchase(C0444e c0444e, Object obj) {
        switch (this.signatures) {
            case 0:
                ((InterfaceC11855e) c0444e.f2491e).premium(Double.doubleToLongBits(((Number) obj).doubleValue()));
                return;
            case 1:
                ((InterfaceC11855e) c0444e.f2491e).mo2630native(Float.floatToIntBits(((Number) obj).floatValue()));
                return;
            case 2:
                throw new IllegalStateException("Operation not supported.");
            case 3:
                c0444e.m353protected(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 4:
                c0444e.m356try((C0193e) obj);
                return;
            case 5:
                Duration duration = (Duration) obj;
                long amazon = amazon(duration);
                if (amazon != 0) {
                    AbstractC11069e.adcel.startapp(c0444e, 1, Long.valueOf(amazon));
                }
                int smaato = smaato(duration);
                if (smaato != 0) {
                    AbstractC11069e.billing.startapp(c0444e, 2, Integer.valueOf(smaato));
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                ((InterfaceC11855e) c0444e.f2491e).mo2630native(((Number) obj).intValue());
                return;
            case 8:
                ((InterfaceC11855e) c0444e.f2491e).premium(((Number) obj).longValue());
                return;
            case 9:
                Instant instant = (Instant) obj;
                long epochSecond = instant.getEpochSecond();
                if (epochSecond != 0) {
                    AbstractC11069e.adcel.startapp(c0444e, 1, Long.valueOf(epochSecond));
                }
                int nano = instant.getNano();
                if (nano != 0) {
                    AbstractC11069e.billing.startapp(c0444e, 2, Integer.valueOf(nano));
                    return;
                }
                return;
            case 10:
                int intValue = ((Number) obj).intValue();
                if (intValue >= 0) {
                    c0444e.m353protected(intValue);
                    return;
                } else {
                    c0444e.m347break(intValue);
                    return;
                }
            case 11:
                c0444e.m347break(((Number) obj).longValue());
                return;
            case 12:
                int intValue2 = ((Number) obj).intValue();
                c0444e.m353protected((intValue2 >> 31) ^ (intValue2 << 1));
                return;
            case 13:
                long longValue = ((Number) obj).longValue();
                c0444e.m347break((longValue >> 63) ^ (longValue << 1));
                return;
            case 14:
                ((InterfaceC11855e) c0444e.f2491e).mo2631private((String) obj);
                return;
            case 15:
                List list = (List) obj;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC11069e.pro.startapp(c0444e, 1, it.next());
                }
                return;
            case 16:
                Map map = (Map) obj;
                if (map == null) {
                    return;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    C14808e c14808e = AbstractC11069e.Signature;
                    int advert = c14808e.advert(1, str);
                    C14808e c14808e2 = AbstractC11069e.pro;
                    int advert2 = c14808e2.advert(2, value) + advert;
                    c0444e.getClass();
                    c0444e.m353protected(8 | AbstractC4653e.signatures(3));
                    c0444e.m353protected(advert2);
                    c14808e.startapp(c0444e, 1, str);
                    c14808e2.startapp(c0444e, 2, value);
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c0444e.m353protected(0);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj == null) {
                    AbstractC11069e.remoteconfig.startapp(c0444e, 1, obj);
                    return;
                }
                if (obj instanceof Number) {
                    AbstractC11069e.amazon.startapp(c0444e, 2, Double.valueOf(((Number) obj).doubleValue()));
                    return;
                }
                if (obj instanceof String) {
                    AbstractC11069e.Signature.startapp(c0444e, 3, obj);
                    return;
                }
                if (obj instanceof Boolean) {
                    AbstractC11069e.purchase.startapp(c0444e, 4, obj);
                    return;
                }
                if (obj instanceof Map) {
                    AbstractC11069e.admob.startapp(c0444e, 5, (Map) obj);
                    return;
                } else {
                    if (!(obj instanceof List)) {
                        throw new IllegalArgumentException(AbstractC1634e.advert(obj, "unexpected struct value: "));
                    }
                    AbstractC11069e.subscription.startapp(c0444e, 6, obj);
                    return;
                }
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                c0444e.m353protected(((Number) obj).intValue());
                return;
            default:
                c0444e.m347break(((Number) obj).longValue());
                return;
        }
    }

    @Override // defpackage.AbstractC11069e
    public void startapp(C0444e c0444e, int i, Object obj) {
        switch (this.signatures) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                c0444e.getClass();
                c0444e.m353protected((i << 3) | AbstractC4653e.signatures(this.license));
                c0444e.m353protected(0);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (obj != null) {
                    super.startapp(c0444e, i, obj);
                    return;
                }
                c0444e.getClass();
                c0444e.m353protected((i << 3) | AbstractC4653e.signatures(this.license));
                c0444e.m353protected(mopub(obj));
                purchase(c0444e, obj);
                return;
            default:
                super.startapp(c0444e, i, obj);
                return;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0024. Please report as an issue. */
    @Override // defpackage.AbstractC11069e
    public final java.lang.Object vip(defpackage.C17582e r10) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14808e.vip(eؘ٘٘):java.lang.Object");
    }
}
