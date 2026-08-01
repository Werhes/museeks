package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4191e {
    protected int zza;

    public static void vip(ArrayList arrayList, List list) {
        Charset charset = AbstractC9561e.ad;
        int size = arrayList.size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof C17026e) {
            C17026e c17026e = (C17026e) list;
            int i = c17026e.f33354e + size;
            int length = c17026e.f33355e.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = AbstractC1634e.startapp(length, 3, 2, 1, 10);
                    }
                    c17026e.f33355e = Arrays.copyOf(c17026e.f33355e, length);
                } else {
                    c17026e.f33355e = new Object[Math.max(i, 10)];
                }
            }
        }
        int size2 = list.size();
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                int size4 = list.size() - size2;
                StringBuilder sb = new StringBuilder(String.valueOf(size4).length() + 26);
                sb.append("Element at index ");
                sb.append(size4);
                sb.append(" is null.");
                String sb2 = sb.toString();
                int size5 = list.size();
                while (true) {
                    size5--;
                    if (size5 < size2) {
                        break;
                    } else {
                        list.remove(size5);
                    }
                }
                throw new NullPointerException(sb2);
            }
            list.add(obj);
        }
    }

    public abstract int ad(InterfaceC0627e interfaceC0627e);
}
