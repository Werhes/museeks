package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC16209e implements Callable {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object appmetrica;
    public final /* synthetic */ int license;
    public final /* synthetic */ Context metrica;
    public final /* synthetic */ String vip;

    public /* synthetic */ CallableC16209e(String str, Context context, Object obj, int i, int i2) {
        this.ad = i2;
        this.vip = str;
        this.metrica = context;
        this.appmetrica = obj;
        this.license = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.ad;
        int i2 = this.license;
        Object obj = this.appmetrica;
        Context context = this.metrica;
        String str = this.vip;
        switch (i) {
            case 0:
                Object[] objArr = {(C10359e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return AbstractC4833e.vip(str, context, DesugarCollections.unmodifiableList(arrayList), i2);
            default:
                try {
                    return AbstractC4833e.vip(str, context, (ArrayList) obj, i2);
                } catch (Throwable unused) {
                    return new C14836e(-3);
                }
        }
    }
}
