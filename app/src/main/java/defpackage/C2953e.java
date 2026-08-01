package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۣؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2953e implements InterfaceC2460e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f6975e = {AbstractC3820e.ad.yandex(new C12156e(C2953e.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0394e f6976e;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٖؑٚ, eٖۥٌ] */
    public C2953e(InterfaceC11542e interfaceC11542e, Function0 function0) {
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.f6976e = new C16622e(c6272e, function0);
    }

    @Override // defpackage.InterfaceC2460e
    public final boolean amazon(C12816e c12816e) {
        return license(c12816e) != null;
    }

    @Override // defpackage.InterfaceC2460e
    public boolean isEmpty() {
        InterfaceC8614e interfaceC8614e = f6975e[0];
        return ((List) this.f6976e.invoke()).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        InterfaceC8614e interfaceC8614e = f6975e[0];
        return ((List) this.f6976e.invoke()).iterator();
    }

    @Override // defpackage.InterfaceC2460e
    public final InterfaceC16566e license(C12816e c12816e) {
        Object obj;
        Iterator it = iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (AbstractC7890e.billing(((InterfaceC16566e) obj).mopub(), c12816e)) {
                break;
            }
        }
        return (InterfaceC16566e) obj;
    }
}
