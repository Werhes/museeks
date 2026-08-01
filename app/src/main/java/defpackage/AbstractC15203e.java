package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15203e {
    public static final C2892e ad = new C2892e(-8422107, false, new C0972e(16));

    public AbstractC15203e() {
        new ConcurrentHashMap();
    }

    public static final String ad(C9885e c9885e, Function1 function1) {
        List list = c9885e.firebase;
        if (list == null || list.isEmpty()) {
            C17561e c17561e = (C17561e) function1.invoke(new C5655e(c9885e.vip));
            String ad2 = c17561e != null ? c17561e.ad() : null;
            return ad2 == null ? BuildConfig.FLAVOR : ad2;
        }
        Iterable iterable = c9885e.f19490interface;
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        return AbstractC13480e.m3608try(AbstractC13480e.m3584final(list, iterable), null, null, null, C18026e.f35350e, 31);
    }

    public static final long billing(AbstractC16904e abstractC16904e) {
        return AbstractC1561e.purchase(((C2616e) abstractC16904e.license.f17053e).purchase() * abstractC16904e.amazon()) + (((C16330e) abstractC16904e.license.f17056e).purchase() * abstractC16904e.amazon());
    }

    public static final void vip(C1169e c1169e, InterfaceC14232e interfaceC14232e) {
        if (interfaceC14232e instanceof C15965e) {
            c1169e.add(((C15965e) interfaceC14232e).ad);
            return;
        }
        if (interfaceC14232e instanceof C7725e) {
            Iterator it = ((C7725e) interfaceC14232e).ad.iterator();
            while (it.hasNext()) {
                vip(c1169e, (InterfaceC7351e) it.next());
            }
            return;
        }
        if (interfaceC14232e instanceof C11629e) {
            return;
        }
        if (interfaceC14232e instanceof C12433e) {
            vip(c1169e, ((C12433e) interfaceC14232e).ad);
            return;
        }
        if (!(interfaceC14232e instanceof C8867e)) {
            if (!(interfaceC14232e instanceof C17417e)) {
                throw new C14803e(10);
            }
            vip(c1169e, ((C17417e) interfaceC14232e).vip);
        } else {
            C8867e c8867e = (C8867e) interfaceC14232e;
            vip(c1169e, c8867e.ad);
            Iterator it2 = c8867e.vip.iterator();
            while (it2.hasNext()) {
                vip(c1169e, (InterfaceC14232e) it2.next());
            }
        }
    }

    public static C14959e yandex(C14959e[] c14959eArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        C14959e c14959e = null;
        int i3 = Alert.DURATION_SHOW_INDEFINITELY;
        for (C14959e c14959e2 : c14959eArr) {
            int abs = (Math.abs(c14959e2.metrica - i2) * 2) + (c14959e2.license == z ? 0 : 1);
            if (c14959e == null || i3 > abs) {
                c14959e = c14959e2;
                i3 = abs;
            }
        }
        return c14959e;
    }

    public Typeface appmetrica(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract Typeface license(Context context, C14959e[] c14959eArr, int i);

    public abstract Typeface metrica(Context context, C13078e c13078e, Resources resources, int i);

    public Typeface purchase(Context context, Resources resources, int i, String str, int i2) {
        File adcel = AbstractC16994e.adcel(context);
        if (adcel == null) {
            return null;
        }
        try {
            if (AbstractC16994e.license(adcel, resources, i)) {
                return Typeface.createFromFile(adcel.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            adcel.delete();
        }
    }
}
