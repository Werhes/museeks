package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* renamed from: eًؘؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7762e extends AbstractC16342e {
    public static List Signature(InterfaceC9093e interfaceC9093e) {
        Iterator it = interfaceC9093e.iterator();
        if (!it.hasNext()) {
            return C13664e.f27089e;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static C12150e adcel(InterfaceC9093e interfaceC9093e, Function1 function1) {
        return new C12150e(interfaceC9093e, false, function1);
    }

    public static ArrayList admob(InterfaceC9093e interfaceC9093e) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC9093e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static InterfaceC9093e advert(Object obj, Function1 function1) {
        return obj == null ? C7671e.ad : new C6993e(new C14923e(1, obj), function1, 0);
    }

    public static Object amazon(InterfaceC9093e interfaceC9093e) {
        Iterator it = interfaceC9093e.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static InterfaceC9093e billing(Iterator it) {
        return new C15006e(new C1356e(5, it));
    }

    public static C12150e loadAd(InterfaceC9093e interfaceC9093e, Function1 function1) {
        return adcel(new C2167e(interfaceC9093e, function1), new C7983e(14));
    }

    public static C8522e mopub(InterfaceC9093e interfaceC9093e, Function1 function1) {
        return new C8522e(interfaceC9093e, function1, C15109e.f29892e);
    }

    public static String smaato(InterfaceC9093e interfaceC9093e, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) BuildConfig.FLAVOR);
        int i = 0;
        for (Object obj : interfaceC9093e) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            AbstractC17540e.vip(sb, obj, null);
        }
        sb.append((CharSequence) BuildConfig.FLAVOR);
        return sb.toString();
    }

    public static C12150e startapp(InterfaceC9093e interfaceC9093e, Function1 function1) {
        return new C12150e(interfaceC9093e, true, function1);
    }

    public static InterfaceC9093e yandex(InterfaceC9093e interfaceC9093e, int i) {
        if (i >= 0) {
            return i == 0 ? interfaceC9093e : interfaceC9093e instanceof InterfaceC8108e ? ((InterfaceC8108e) interfaceC9093e).ad(i) : new C10131e(interfaceC9093e, i);
        }
        throw new IllegalArgumentException(AbstractC1634e.smaato("Requested element count ", i, " is less than zero.").toString());
    }
}
