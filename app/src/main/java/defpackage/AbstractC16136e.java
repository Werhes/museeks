package defpackage;

import java.io.IOException;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16136e implements InterfaceC12163e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C16728e f31719e = new C16728e(11);

    public static final void ad(C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(441837433);
        if (c13770e.m3673protected(i & 1, (i & 3) != 2)) {
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = new Object();
                c13770e.m3682throws(m3681throw);
            }
            C7114e c7114e = (C7114e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == c5170e) {
                m3681throw2 = C7309e.f14958e;
                c13770e.m3682throws(m3681throw2);
            }
            Function0 function0 = (Function0) m3681throw2;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function0);
            } else {
                c13770e.m3684volatile();
            }
            if (c13770e.f27292implements) {
                c13770e.vip(Unit.INSTANCE, new C14151e((byte) 0, 29));
            }
            AbstractC2270e.yandex(c13770e, c7114e, C14865e.f29435e);
            c2892e.invoke(c7114e, c13770e, 48);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C7439e(c2892e, i, 0);
        }
    }

    public static boolean appmetrica(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = C5949e.f12529e;
            }
        } else {
            if (!(collection instanceof InterfaceC14257e)) {
                return false;
            }
            obj = ((AbstractC12107e) ((InterfaceC14257e) collection)).f24269e;
        }
        return comparator.equals(obj);
    }

    public static void license(InterfaceC9660e interfaceC9660e) {
        if (interfaceC9660e != null) {
            try {
                interfaceC9660e.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final InterfaceC12864e metrica(InterfaceC12864e interfaceC12864e, long j, InterfaceC16154e interfaceC16154e) {
        return interfaceC12864e.premium(new C15982e(j, null, interfaceC16154e, 2));
    }

    public static InterfaceC12864e vip(InterfaceC12864e interfaceC12864e, C11078e c11078e) {
        return interfaceC12864e.premium(new C15982e(0L, c11078e, AbstractC10432e.ad, 1));
    }
}
