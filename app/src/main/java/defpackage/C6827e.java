package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۨٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6827e implements InterfaceC8177e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC10481e f14058e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14059e;

    public /* synthetic */ C6827e(InterfaceC10481e interfaceC10481e, int i) {
        this.f14059e = i;
        this.f14058e = interfaceC10481e;
    }

    @Override // defpackage.InterfaceC12864e
    public final Object appmetrica(Object obj, Function2 function2) {
        switch (this.f14059e) {
            case 0:
                return function2.invoke(obj, this);
            case 1:
                return function2.invoke(obj, this);
            case 2:
                return function2.invoke(obj, this);
            default:
                return function2.invoke(obj, this);
        }
    }

    @Override // defpackage.InterfaceC12864e
    public final /* synthetic */ InterfaceC12864e premium(InterfaceC12864e interfaceC12864e) {
        int i = this.f14059e;
        return AbstractC5087e.isVip(this, interfaceC12864e);
    }

    @Override // defpackage.InterfaceC12864e
    /* renamed from: volatile */
    public final boolean mo256volatile(Function1 function1) {
        switch (this.f14059e) {
            case 0:
            case 1:
            case 2:
            default:
                return ((Boolean) function1.invoke(this)).booleanValue();
        }
    }
}
