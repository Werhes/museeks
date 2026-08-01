package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6987e implements Consumer {
    public final /* synthetic */ int ad;

    public /* synthetic */ C6987e(int i) {
        this.ad = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.ad) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                C2123e c2123e = C5517e.f11791e;
                throw null;
            default:
                throw AbstractC8647e.isVip(obj);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        int i = this.ad;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
