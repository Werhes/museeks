package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1628e extends AbstractC14533e {
    public final /* synthetic */ Set adcel;
    public final /* synthetic */ Function1 mopub;
    public final /* synthetic */ InterfaceC5052e startapp;

    public C1628e(InterfaceC5052e interfaceC5052e, Set set, Function1 function1) {
        this.startapp = interfaceC5052e;
        this.adcel = set;
        this.mopub = function1;
    }

    @Override // defpackage.AbstractC14533e
    public final /* bridge */ /* synthetic */ Object advert() {
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC14533e
    public final boolean vip(Object obj) {
        InterfaceC5052e interfaceC5052e = (InterfaceC5052e) obj;
        if (interfaceC5052e == this.startapp) {
            return true;
        }
        InterfaceC8528e mo1719e = interfaceC5052e.mo1719e();
        if (!(mo1719e instanceof AbstractC7722e)) {
            return true;
        }
        this.adcel.addAll((Collection) this.mopub.invoke(mo1719e));
        return false;
    }
}
