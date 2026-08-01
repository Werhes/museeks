package defpackage;

import androidx.car.app.model.Alert;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۧٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15118e {
    public static final int[] ad = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final int[] vip = {463601321, -1045562440, 1239460018, -1189350089, -412821483, 1160071467, -1564970643, 1256291574, -1170454588, -240530412, 2118977290, -1845154869, -1618855054, -1019204973, 1437344377, -1849925303, 1189267370, 280387897, -680846520, -500732508, -1100672524, -1, -1, -1, -1, -1, -1, 268435455};

    public static final void ad(Function0 function0, InterfaceC12864e interfaceC12864e, C7513e c7513e, InterfaceC14306e interfaceC14306e, C13770e c13770e, int i) {
        c13770e.m3671package(1055276397);
        int i2 = (c13770e.yandex(function0) ? 4 : 2) | i | (c13770e.purchase(interfaceC12864e) ? 32 : 16) | (c13770e.purchase(c7513e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(interfaceC14306e) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            AbstractC8787e.ad(AbstractC16653e.license(-933153643, new C12050e(c7513e, interfaceC12864e, interfaceC14306e, AbstractC14533e.mopub(function0, c13770e), 6), c13770e), c13770e, 6);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(function0, interfaceC12864e, c7513e, interfaceC14306e, i, 9);
        }
    }

    public static final void appmetrica(InterfaceC17453e interfaceC17453e) {
        AbstractC5851e.mopub(interfaceC17453e).m3723this();
    }

    public static String billing(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(yandex(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(yandex(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static long license(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i, 262142);
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i5 = 65534;
            } else if (i7 < 65535) {
                i5 = 32766;
            } else {
                if (i7 >= 262143) {
                    AbstractC2278e.advert(i7);
                    throw new C14803e(9);
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            i6 = Math.min(i5, i4);
        }
        return AbstractC2278e.ad(min, min2, Math.min(i5, i3), i6);
    }

    public static long metrica(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i5 = 65534;
            } else if (i7 < 65535) {
                i5 = 32766;
            } else {
                if (i7 >= 262143) {
                    AbstractC2278e.advert(i7);
                    throw new C14803e(9);
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            i6 = Math.min(i5, i2);
        }
        return AbstractC2278e.ad(Math.min(i5, i), i6, min, min2);
    }

    public static byte[] purchase(byte[] bArr) {
        long appmetrica = AbstractC12751e.appmetrica(84, bArr);
        long j = appmetrica & 4294967295L;
        long appmetrica2 = AbstractC12751e.appmetrica(91, bArr);
        long j2 = appmetrica2 & 4294967295L;
        long appmetrica3 = AbstractC12751e.appmetrica(98, bArr);
        long j3 = appmetrica3 & 4294967295L;
        long appmetrica4 = AbstractC12751e.appmetrica(105, bArr);
        long j4 = ((bArr[112] & 255) | ((bArr[113] & 255) << 8)) & 4294967295L;
        long license = ((AbstractC12751e.license(109, bArr) << 4) & 4294967295L) + ((appmetrica4 & 4294967295L) >>> 28);
        long j5 = appmetrica4 & 268435455;
        long appmetrica5 = (j5 * 163752818) + (license * 30366549) + (j4 * 43969588) + (AbstractC12751e.appmetrica(56, bArr) & 4294967295L);
        long license2 = (j5 * 258169998) + (license * 163752818) + (j4 * 30366549) + ((AbstractC12751e.license(60, bArr) << 4) & 4294967295L);
        long appmetrica6 = (j5 * 96434764) + (license * 258169998) + (j4 * 163752818) + (AbstractC12751e.appmetrica(63, bArr) & 4294967295L);
        long license3 = (j5 * 227822194) + (license * 96434764) + (j4 * 258169998) + ((AbstractC12751e.license(67, bArr) << 4) & 4294967295L);
        long appmetrica7 = (j5 * 149865618) + (license * 227822194) + (j4 * 96434764) + (AbstractC12751e.appmetrica(70, bArr) & 4294967295L);
        long license4 = ((AbstractC12751e.license(102, bArr) << 4) & 4294967295L) + (j3 >>> 28);
        long j6 = appmetrica3 & 268435455;
        long license5 = (license4 * 43969588) + ((AbstractC12751e.license(46, bArr) << 4) & 4294967295L);
        long appmetrica8 = (license4 * 30366549) + (j5 * 43969588) + (AbstractC12751e.appmetrica(49, bArr) & 4294967295L);
        long license6 = (license4 * 163752818) + (j5 * 30366549) + (license * 43969588) + ((AbstractC12751e.license(53, bArr) << 4) & 4294967295L);
        long j7 = (license4 * 258169998) + appmetrica5;
        long j8 = (license4 * 96434764) + license2;
        long j9 = (license4 * 227822194) + appmetrica6;
        long j10 = (license4 * 149865618) + license3;
        long j11 = (license4 * 550336261) + appmetrica7;
        long appmetrica9 = (j6 * 43969588) + (AbstractC12751e.appmetrica(42, bArr) & 4294967295L);
        long j12 = (j6 * 30366549) + license5;
        long j13 = (j6 * 163752818) + appmetrica8;
        long j14 = (j6 * 258169998) + license6;
        long j15 = (j6 * 96434764) + j7;
        long j16 = (j6 * 227822194) + j8;
        long j17 = (j6 * 149865618) + j9;
        long j18 = (j6 * 550336261) + j10;
        long license7 = ((AbstractC12751e.license(95, bArr) << 4) & 4294967295L) + (j2 >>> 28);
        long j19 = appmetrica2 & 268435455;
        long j20 = (license7 * 163752818) + j12;
        long j21 = (license7 * 258169998) + j13;
        long j22 = (license7 * 149865618) + j16;
        long appmetrica10 = (j19 * 43969588) + (AbstractC12751e.appmetrica(35, bArr) & 4294967295L);
        long license8 = (j19 * 30366549) + (license7 * 43969588) + ((AbstractC12751e.license(39, bArr) << 4) & 4294967295L);
        long j23 = (j19 * 163752818) + (license7 * 30366549) + appmetrica9;
        long j24 = (j19 * 258169998) + j20;
        long j25 = (j19 * 96434764) + j21;
        long j26 = (j19 * 227822194) + (license7 * 96434764) + j14;
        long j27 = (j19 * 149865618) + (license7 * 227822194) + j15;
        long j28 = (j19 * 550336261) + j22;
        long license9 = ((AbstractC12751e.license(88, bArr) << 4) & 4294967295L) + (j >>> 28);
        long license10 = (license9 * 43969588) + ((AbstractC12751e.license(32, bArr) << 4) & 4294967295L);
        long j29 = (license9 * 30366549) + appmetrica10;
        long j30 = (license9 * 163752818) + license8;
        long j31 = (license9 * 258169998) + j23;
        long j32 = (license9 * 149865618) + j26;
        long license11 = (j5 * 550336261) + (license * 149865618) + (j4 * 227822194) + ((AbstractC12751e.license(74, bArr) << 4) & 4294967295L) + (j11 >>> 28);
        long j33 = j11 & 268435455;
        long appmetrica11 = (license * 550336261) + (j4 * 149865618) + (AbstractC12751e.appmetrica(77, bArr) & 4294967295L) + (license11 >>> 28);
        long license12 = (j4 * 550336261) + ((AbstractC12751e.license(81, bArr) << 4) & 4294967295L) + (appmetrica11 >>> 28);
        long j34 = appmetrica11 & 268435455;
        long j35 = (appmetrica & 268435455) + (license12 >>> 28);
        long j36 = license12 & 268435455;
        long appmetrica12 = (j35 * 43969588) + (AbstractC12751e.appmetrica(28, bArr) & 4294967295L);
        long j37 = (j35 * 30366549) + license10;
        long j38 = (j35 * 163752818) + j29;
        long j39 = (j35 * 258169998) + j30;
        long j40 = (j35 * 96434764) + j31;
        long j41 = (j35 * 227822194) + (license9 * 96434764) + j24;
        long j42 = (j35 * 149865618) + (license9 * 227822194) + j25;
        long j43 = (j35 * 550336261) + j32;
        long license13 = (j36 * 43969588) + ((AbstractC12751e.license(25, bArr) << 4) & 4294967295L);
        long j44 = (j36 * 30366549) + appmetrica12;
        long j45 = (j36 * 163752818) + j37;
        long j46 = (j36 * 258169998) + j38;
        long j47 = (j36 * 96434764) + j39;
        long j48 = (j36 * 227822194) + j40;
        long j49 = (j36 * 149865618) + j41;
        long j50 = (j36 * 550336261) + j42;
        long appmetrica13 = (j34 * 43969588) + (AbstractC12751e.appmetrica(21, bArr) & 4294967295L);
        long j51 = (j34 * 30366549) + license13;
        long j52 = (j34 * 163752818) + j44;
        long j53 = (j34 * 258169998) + j45;
        long j54 = (j34 * 96434764) + j46;
        long j55 = (j34 * 227822194) + j47;
        long j56 = (j34 * 149865618) + j48;
        long j57 = (j34 * 550336261) + j49;
        long j58 = (license7 * 550336261) + j17 + (j28 >>> 28);
        long j59 = j28 & 268435455;
        long j60 = j18 + (j58 >>> 28);
        long j61 = j58 & 268435455;
        long j62 = j33 + (j60 >>> 28);
        long j63 = j60 & 268435455;
        long j64 = (license11 & 268435455) + (j62 >>> 28);
        long j65 = j62 & 268435455;
        long license14 = (j64 * 43969588) + ((AbstractC12751e.license(18, bArr) << 4) & 4294967295L);
        long j66 = (j64 * 30366549) + appmetrica13;
        long j67 = (j64 * 163752818) + j51;
        long j68 = (j64 * 258169998) + j52;
        long j69 = (j64 * 96434764) + j53;
        long j70 = (j64 * 227822194) + j54;
        long j71 = (j64 * 149865618) + j55;
        long j72 = (j64 * 550336261) + j56;
        long j73 = (j65 * 163752818) + j66;
        long j74 = (j65 * 258169998) + j67;
        long j75 = (j65 * 96434764) + j68;
        long j76 = (j65 * 227822194) + j69;
        long j77 = (j65 * 149865618) + j70;
        long license15 = (j63 * 43969588) + ((AbstractC12751e.license(11, bArr) << 4) & 4294967295L);
        long appmetrica14 = (j63 * 30366549) + (j65 * 43969588) + (AbstractC12751e.appmetrica(14, bArr) & 4294967295L);
        long j78 = (j63 * 163752818) + (j65 * 30366549) + license14;
        long j79 = (j63 * 258169998) + j73;
        long j80 = (j63 * 96434764) + j74;
        long j81 = (j63 * 227822194) + j75;
        long j82 = (j63 * 149865618) + j76;
        long j83 = (j63 * 550336261) + j77;
        long j84 = j43 + (j50 >>> 28);
        long j85 = (license9 * 550336261) + j27 + (j84 >>> 28);
        long j86 = j59 + (j85 >>> 28);
        long j87 = j61 + (j86 >>> 28);
        long j88 = j86 & 268435455;
        long j89 = (j87 * 30366549) + license15;
        long j90 = (j87 * 163752818) + appmetrica14;
        long j91 = (j87 * 258169998) + j78;
        long j92 = (j87 * 96434764) + j79;
        long license16 = (43969588 * j88) + ((AbstractC12751e.license(4, bArr) << 4) & 4294967295L);
        long j93 = (258169998 * j88) + j90;
        long j94 = j84 & 67108863;
        long j95 = ((j85 & 268435455) * 4) + ((j84 & 268435455) >>> 26) + 1;
        long appmetrica15 = (j95 * 78101261) + (AbstractC12751e.appmetrica(0, bArr) & 4294967295L);
        long j96 = (j95 * 141809365) + license16;
        long appmetrica16 = (j95 * 175155932) + (30366549 * j88) + (j87 * 43969588) + (AbstractC12751e.appmetrica(7, bArr) & 4294967295L);
        long j97 = (j95 * 64542499) + (163752818 * j88) + j89;
        long j98 = (j95 * 158326419) + j93;
        long j99 = (j95 * 191173276) + (96434764 * j88) + j91;
        long j100 = (j95 * 104575268) + (227822194 * j88) + j92;
        long j101 = j96 + (appmetrica15 >>> 28);
        long j102 = appmetrica16 + (j101 >>> 28);
        long j103 = j97 + (j102 >>> 28);
        long j104 = j98 + (j103 >>> 28);
        long j105 = j99 + (j104 >>> 28);
        long j106 = j100 + (j105 >>> 28);
        long j107 = (j95 * 137584065) + (149865618 * j88) + (j87 * 227822194) + j80 + (j106 >>> 28);
        long j108 = (j88 * 550336261) + (j87 * 149865618) + j81 + (j107 >>> 28);
        long j109 = (j87 * 550336261) + j82 + (j108 >>> 28);
        long j110 = j83 + (j109 >>> 28);
        long j111 = (j65 * 550336261) + j71 + (j110 >>> 28);
        long j112 = j72 + (j111 >>> 28);
        long j113 = j57 + (j112 >>> 28);
        long j114 = (j50 & 268435455) + (j113 >>> 28);
        long j115 = j94 + (j114 >>> 28);
        long j116 = (j115 >>> 26) - 1;
        long j117 = (appmetrica15 & 268435455) - (j116 & 78101261);
        long j118 = ((j101 & 268435455) - (j116 & 141809365)) + (j117 >> 28);
        long j119 = ((j102 & 268435455) - (j116 & 175155932)) + (j118 >> 28);
        long j120 = ((j103 & 268435455) - (j116 & 64542499)) + (j119 >> 28);
        long j121 = ((j104 & 268435455) - (j116 & 158326419)) + (j120 >> 28);
        long j122 = ((j105 & 268435455) - (j116 & 191173276)) + (j121 >> 28);
        long j123 = ((j106 & 268435455) - (j116 & 104575268)) + (j122 >> 28);
        long j124 = ((j107 & 268435455) - (j116 & 137584065)) + (j123 >> 28);
        long j125 = (j108 & 268435455) + (j124 >> 28);
        long j126 = (j109 & 268435455) + (j125 >> 28);
        long j127 = (j110 & 268435455) + (j126 >> 28);
        long j128 = (j111 & 268435455) + (j127 >> 28);
        long j129 = (j112 & 268435455) + (j128 >> 28);
        long j130 = (j113 & 268435455) + (j129 >> 28);
        long j131 = (j114 & 268435455) + (j130 >> 28);
        byte[] bArr2 = new byte[57];
        AbstractC12751e.startapp(0, (j117 & 268435455) | ((j118 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(7, ((j120 & 268435455) << 28) | (j119 & 268435455), bArr2);
        AbstractC12751e.startapp(14, (j121 & 268435455) | ((j122 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(21, (j123 & 268435455) | ((j124 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(28, ((j126 & 268435455) << 28) | (j125 & 268435455), bArr2);
        AbstractC12751e.startapp(35, (j127 & 268435455) | ((j128 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(42, (j129 & 268435455) | ((j130 & 268435455) << 28), bArr2);
        AbstractC12751e.startapp(49, (((67108863 & j115) + (j131 >> 28)) << 28) | (j131 & 268435455), bArr2);
        return bArr2;
    }

    public static void vip(byte[] bArr, int[] iArr) {
        AbstractC12751e.purchase(14, bArr, iArr);
    }

    public static String yandex(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String ads = AbstractC8647e.ads(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(ads), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(ads.length() + 8 + name2.length() + 1);
            AbstractC13501e.Signature(sb, "<", ads, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
