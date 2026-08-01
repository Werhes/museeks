package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1574e {
    public static final C2892e ad = new C2892e(1744504977, false, new C14234e(0));
    public static final C2892e vip = new C2892e(-1633700879, false, new C14234e(1));
    public static final C2892e metrica = new C2892e(-1629908745, false, new C17240e(3));
    public static final C2892e license = new C2892e(1460936490, false, new C17240e(4));
    public static final C2892e appmetrica = new C2892e(2029096363, false, new C17240e(5));
    public static final C2892e purchase = new C2892e(-2013949599, false, new C14234e(2));
    public static final C2892e billing = new C2892e(2144990400, false, new C14234e(3));

    public static final void ad(List list, Function1 function1, C13770e c13770e, int i) {
        c13770e.m3671package(1068626853);
        int i2 = (c13770e.yandex(list) ? 4 : 2) | i | (c13770e.yandex(function1) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            boolean purchase2 = c13770e.purchase(list);
            Object m3681throw = c13770e.m3681throw();
            if (purchase2 || m3681throw == C2987e.ad) {
                Iterator it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    Integer num = ((Catalog2ReplacementOption) it.next()).license;
                    if (num != null && num.intValue() == 1) {
                        break;
                    } else {
                        i3++;
                    }
                }
                m3681throw = Integer.valueOf(i3);
                c13770e.m3682throws(m3681throw);
            }
            int intValue = ((Number) m3681throw).intValue();
            float f = 8;
            AbstractC9672e.ad(intValue, AbstractC12220e.loadAd(AbstractC13328e.license(AbstractC18007e.metrica(C0115e.f1276e, 1.0f), AbstractC13328e.billing()), 0.0f, f, 0.0f, 0.0f, 13), C3618e.startapp, 0L, 16, 0, f, AbstractC16653e.license(-1214928892, new C14362e(intValue, 1), c13770e), AbstractC16653e.license(383748163, new C1744e(list, function1), c13770e), c13770e, 115040640);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1744e(list, function1, i);
        }
    }

    public static final boolean appmetrica(long j) {
        return (j & 2) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [eؕۦؚ, eؚؖؒ] */
    public static C6927e billing(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    ?? abstractC3757e = new AbstractC3757e();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    abstractC3757e.f8352e = duplicate;
                    abstractC3757e.f8353e = position;
                    int i6 = position - duplicate.getInt(position);
                    abstractC3757e.f8351e = i6;
                    abstractC3757e.f8350e = ((ByteBuffer) abstractC3757e.f8352e).getShort(i6);
                    return abstractC3757e;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final float license(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final int metrica(long j, long j2) {
        boolean purchase2 = purchase(j);
        if (purchase2 != purchase(j2)) {
            return purchase2 ? -1 : 1;
        }
        return (Math.min(license(j), license(j2)) >= 0.0f && appmetrica(j) != appmetrica(j2)) ? appmetrica(j) ? -1 : 1 : (int) Math.signum(license(j) - license(j2));
    }

    public static final boolean purchase(long j) {
        return (j & 1) != 0;
    }

    public static final int vip(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }
}
