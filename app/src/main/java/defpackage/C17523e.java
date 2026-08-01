package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؔٞ */
/* loaded from: classes3.dex */
public final class C17523e extends AbstractC8530e {
    public final /* synthetic */ C7040e appmetrica;
    public final C0394e license;
    public final C1159e metrica;
    public final C1159e vip;

    /* JADX WARN: Type inference failed for: r0v3, types: [eٖؑٚ, eٖۥٌ] */
    public C17523e(C7040e c7040e, InterfaceC11542e interfaceC11542e) {
        if (interfaceC11542e == null) {
            yandex(0);
            throw null;
        }
        this.appmetrica = c7040e;
        C6272e c6272e = (C6272e) interfaceC11542e;
        this.vip = c6272e.vip(new C10276e(this, 0));
        this.metrica = c6272e.vip(new C10276e(this, 1));
        this.license = new C16622e(c6272e, new C3411e(19, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void yandex(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17523e.yandex(int):void");
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        if (c0520e != null) {
            return (Collection) this.vip.invoke(c0520e);
        }
        yandex(5);
        throw null;
    }

    public final LinkedHashSet adcel(C0520e c0520e, Collection collection) {
        if (c0520e == null) {
            yandex(10);
            throw null;
        }
        if (collection == null) {
            yandex(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C14514e.metrica.yandex(c0520e, collection, Collections.EMPTY_SET, this.appmetrica, new C7161e(linkedHashSet, 1));
        return linkedHashSet;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set billing() {
        Set set = (Set) this.appmetrica.f14406e.invoke();
        if (set != null) {
            return set;
        }
        yandex(19);
        throw null;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set license() {
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            return set;
        }
        yandex(18);
        throw null;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        if (c4942e == null) {
            yandex(13);
            throw null;
        }
        Collection collection = (Collection) this.license.invoke();
        if (collection != null) {
            return collection;
        }
        yandex(15);
        throw null;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        if (c0520e != null) {
            return (Collection) this.metrica.invoke(c0520e);
        }
        yandex(1);
        throw null;
    }

    public final InterfaceC8528e startapp() {
        InterfaceC8528e mo483e = ((AbstractC1186e) ((AbstractC13101e) this.appmetrica.mo1459goto()).ad().iterator().next()).mo483e();
        if (mo483e != null) {
            return mo483e;
        }
        yandex(9);
        throw null;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set vip() {
        Set set = (Set) this.appmetrica.f14406e.invoke();
        if (set != null) {
            return set;
        }
        yandex(17);
        throw null;
    }
}
