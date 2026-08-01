package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10134e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f20044e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20045e;

    public /* synthetic */ C10134e(int i, Object obj) {
        this.f20045e = i;
        this.f20044e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20045e) {
            case 0:
                return new C11490e((((C14544e) this.f20044e).ad(0, (int) (((C12729e) obj).ad & 4294967295L)) & 4294967295L) | (0 << 32));
            default:
                return new C11490e(((C10156e) this.f20044e).ad(0L, ((C12729e) obj).ad, (EnumC7792e) obj2));
        }
    }
}
