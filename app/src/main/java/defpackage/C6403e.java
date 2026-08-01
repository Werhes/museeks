package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6403e extends AbstractC18270e {
    private static final C6403e DEFAULT_INSTANCE;
    private static volatile InterfaceC8432e PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC17042e strings_ = C2423e.f6221e;

    static {
        C6403e c6403e = new C6403e();
        DEFAULT_INSTANCE = c6403e;
        AbstractC18270e.adcel(C6403e.class, c6403e);
    }

    public static C16463e Signature() {
        return (C16463e) ((AbstractC12661e) DEFAULT_INSTANCE.vip(5));
    }

    public static C6403e amazon() {
        return DEFAULT_INSTANCE;
    }

    public static void smaato(C6403e c6403e, Iterable iterable) {
        InterfaceC17042e interfaceC17042e = c6403e.strings_;
        if (!((AbstractC11000e) interfaceC17042e).f21788e) {
            C2423e c2423e = (C2423e) interfaceC17042e;
            c6403e.strings_ = c2423e.yandex(c2423e.f6223e * 2);
        }
        RandomAccess randomAccess = c6403e.strings_;
        Charset charset = AbstractC2930e.ad;
        if (iterable instanceof InterfaceC8191e) {
            List purchase = ((InterfaceC8191e) iterable).purchase();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((C2423e) randomAccess).getClass();
            Iterator it = purchase.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C6283e) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C6283e.yandex(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC12441e) {
            ((AbstractC11000e) randomAccess).addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (randomAccess instanceof ArrayList) {
                ((ArrayList) randomAccess).ensureCapacity(((C2423e) randomAccess).f6223e + size);
            } else if (randomAccess instanceof C2423e) {
                C2423e c2423e2 = (C2423e) randomAccess;
                int i = c2423e2.f6223e + size;
                Object[] objArr = c2423e2.f6224e;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        c2423e2.f6224e = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = AbstractC1634e.startapp(length, 3, 2, 1, 10);
                        }
                        c2423e2.f6224e = Arrays.copyOf(c2423e2.f6224e, length);
                    }
                }
            }
        }
        C2423e c2423e3 = (C2423e) randomAccess;
        int i2 = c2423e3.f6223e;
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    AbstractC12661e.license(i2, c2423e3);
                    throw null;
                }
                c2423e3.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (obj2 == null) {
                AbstractC12661e.license(i2, c2423e3);
                throw null;
            }
            c2423e3.add(obj2);
        }
    }

    public final InterfaceC17042e loadAd() {
        return this.strings_;
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, eٌؑۦ] */
    @Override // defpackage.AbstractC18270e
    public final Object vip(int i) {
        InterfaceC8432e interfaceC8432e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C8678e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
        }
        if (m2467class == 3) {
            return new C6403e();
        }
        if (m2467class == 4) {
            return new AbstractC12661e(DEFAULT_INSTANCE);
        }
        if (m2467class == 5) {
            return DEFAULT_INSTANCE;
        }
        if (m2467class != 6) {
            throw null;
        }
        InterfaceC8432e interfaceC8432e2 = PARSER;
        if (interfaceC8432e2 != null) {
            return interfaceC8432e2;
        }
        synchronized (C6403e.class) {
            try {
                InterfaceC8432e interfaceC8432e3 = PARSER;
                interfaceC8432e = interfaceC8432e3;
                if (interfaceC8432e3 == null) {
                    ?? obj = new Object();
                    PARSER = obj;
                    interfaceC8432e = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8432e;
    }
}
