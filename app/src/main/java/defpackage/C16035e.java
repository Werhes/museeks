package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16035e extends AbstractC16377e {
    public static final C18334e license;
    public static final C7936e metrica;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        metrica = new C7936e(2);
        license = new C18334e(1);
    }

    public final ByteBuffer adcel(InterfaceC1425e interfaceC1425e, int i) {
        ByteBuffer byteBuffer;
        int i2;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = metrica;
        c7936e.getClass();
        int i3 = C1724e.ad;
        C15246e c15246e = (C15246e) interfaceC1425e;
        C3095e c3095e = c15246e.f30167e;
        ArrayList arrayList = c15246e.f30166e;
        if (c3095e != null) {
            byteBuffer = license.adcel(c3095e, 0);
            i2 = byteBuffer.capacity() + 4;
        } else {
            byteBuffer = null;
            i2 = 0;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i2 += ((C8340e) it.next()).vip().limit() + 4;
        }
        EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i4 = C1724e.ad;
        ByteBuffer allocate = ByteBuffer.allocate(i2 + i);
        if (c15246e.f30167e != null) {
            EnumC17116e enumC17116e = EnumC17116e.VORBIS_COMMENT;
            allocate.put((byte[]) ((i > 0 || arrayList.size() > 0) ? new C0381e(false, enumC17116e, byteBuffer.capacity()) : new C0381e(true, enumC17116e, byteBuffer.capacity())).license);
            allocate.put(byteBuffer);
        }
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C8340e c8340e = (C8340e) listIterator.next();
            EnumC17116e enumC17116e2 = EnumC17116e.PICTURE;
            allocate.put((byte[]) ((i > 0 || listIterator.hasNext()) ? new C0381e(false, enumC17116e2, c8340e.vip().limit()) : new C0381e(true, enumC17116e2, c8340e.vip().limit())).license);
            allocate.put(c8340e.vip());
        }
        EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
        allocate.position();
        c7936e.getClass();
        int i5 = C1724e.ad;
        if (i > 0) {
            int i6 = i - 4;
            allocate.put((byte[]) new C0381e(true, EnumC17116e.PADDING, i6).license);
            allocate.put(ByteBuffer.allocate(i6));
        }
        allocate.rewind();
        return allocate;
    }
}
