package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12539e implements InterfaceC5372e {
    public static final C12539e ad = new Object();
    public static final InterfaceC9998e metrica;
    public static final InterfaceC5372e vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eّ٘ؖ] */
    static {
        InterfaceC5372e serializer = C12567e.Companion.serializer();
        vip = serializer;
        metrica = serializer.appmetrica();
    }

    public static void purchase(InterfaceC5757e interfaceC5757e, C17788e c17788e) {
        if (!(interfaceC5757e instanceof C6929e)) {
            throw new IllegalArgumentException(AbstractC10257e.startapp("Unknown encoder type: ", interfaceC5757e));
        }
        vip.ad(interfaceC5757e, new C12567e(c17788e));
    }

    @Override // defpackage.InterfaceC5372e
    public final /* bridge */ /* synthetic */ void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        purchase(interfaceC5757e, (C17788e) obj);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return metrica;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        CharSequence charSequence;
        if (!(interfaceC11754e instanceof InterfaceC1527e)) {
            throw new IllegalArgumentException(AbstractC10257e.yandex("Unknown decoder type: ", interfaceC11754e));
        }
        C4010e c4010e = ((C12567e) vip.metrica(interfaceC11754e)).ad;
        String str = c4010e.vip;
        AbstractC15211e.ad(16);
        byte parseInt = (byte) Integer.parseInt(str, 16);
        int[] iArr = AbstractC17794e.ad;
        String str2 = c4010e.ad;
        char[] cArr = {'='};
        int length = str2.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char charAt = str2.charAt(length);
                int i2 = 0;
                while (true) {
                    if (i2 >= 1) {
                        i2 = -1;
                        break;
                    }
                    if (charAt == cArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (!(i2 >= 0)) {
                    charSequence = str2.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        charSequence = BuildConfig.FLAVOR;
        byte[] bytes = charSequence.toString().getBytes(AbstractC5508e.ad);
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC13480e.applovin(4, AbstractC1660e.m663break(bytes)).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            int i3 = 0;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                i3 |= ((byte) (((byte) AbstractC17794e.ad[((Number) obj).byteValue() & 255]) & 63)) << ((3 - i4) * 6);
                i4 = i5;
            }
            for (int size = list.size() - 1; size > 0; size--) {
                arrayList.add(Byte.valueOf((byte) ((16711680 & i3) >> 16)));
                i3 <<= 8;
            }
        }
        return new C17788e(parseInt, AbstractC13480e.m3585finally(arrayList));
    }
}
