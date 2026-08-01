package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* renamed from: eَؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2836e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C10184e f6808e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6809e;

    public /* synthetic */ C2836e(C10184e c10184e, int i) {
        this.f6809e = i;
        this.f6808e = c10184e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f6809e) {
            case 0:
                C10184e c10184e = this.f6808e;
                if (AbstractC2876e.purchase(c10184e) == null) {
                    return null;
                }
                ((C17241e) c10184e.f20152e.f23950e).isVip.getClass();
                return null;
            case 1:
                C10184e c10184e2 = this.f6808e;
                C17070e c17070e = c10184e2.f20147e;
                ArrayList typeParameters = c17070e.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C0317e c0317e = (C0317e) it.next();
                    InterfaceC16046e license = ((InterfaceC10383e) c10184e2.f20140e.f23949e).license(c0317e);
                    if (license == null) {
                        throw new AssertionError("Parameter " + c0317e + " surely belongs to class " + c17070e + ", so it must be resolved");
                    }
                    arrayList.add(license);
                }
                return arrayList;
            default:
                return AbstractC8439e.purchase(this.f6808e);
        }
    }
}
