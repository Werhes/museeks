package defpackage;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7711e {
    public static final C2892e ad = new C2892e(1609009290, false, new C15480e(26));

    public static final String ad(AbstractC0232e abstractC0232e, InterfaceC9998e interfaceC9998e) {
        for (Annotation annotation : interfaceC9998e.getAnnotations()) {
            if (annotation instanceof InterfaceC5174e) {
                return ((InterfaceC5174e) annotation).discriminator();
            }
        }
        return abstractC0232e.ad.yandex;
    }

    public static final void license(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            AbstractC8889e.ad("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        AbstractC8889e.ad("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static C6535e metrica(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C11241e c11241e = new C11241e(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(c11241e, 10));
        Iterator it = c11241e.iterator();
        while (true) {
            C3296e c3296e = (C3296e) it;
            if (!c3296e.f7452e) {
                int[] m3586for = AbstractC13480e.m3586for(arrayList);
                return new C6535e(Arrays.copyOf(m3586for, m3586for.length));
            }
            c3296e.nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
    }

    public static C14911e vip(String str, AbstractC3903e abstractC3903e, boolean z) {
        AbstractC0259e.ad(abstractC3903e.f8719e.f32975e);
        return new C14911e(str, abstractC3903e);
    }
}
