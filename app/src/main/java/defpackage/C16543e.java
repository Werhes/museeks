package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16543e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17320e f32435e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32436e;

    public /* synthetic */ C16543e(C17320e c17320e, int i) {
        this.f32436e = i;
        this.f32435e = c17320e;
    }

    public /* synthetic */ C16543e(C17320e c17320e, InterfaceC15671e interfaceC15671e) {
        this.f32436e = 3;
        this.f32435e = c17320e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f32436e;
        boolean z = false;
        C17320e c17320e = this.f32435e;
        switch (i) {
            case 0:
                C0576e c0576e = c17320e.f33996e.pro;
                Boolean bool = Boolean.TRUE;
                c0576e.setValue(bool);
                c17320e.f33996e.remoteconfig.setValue(bool);
                C17320e.m4303e(c17320e.f33996e, (String) ((C13333e) ((InterfaceC18157e) obj)).vip(), c17320e.f33999e);
                return bool;
            case 1:
                List list = (List) obj;
                if (c17320e.f33996e.license() != null) {
                    list.add(c17320e.f33996e.license().ad);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                C17320e.m4303e(c17320e.f33996e, ((C10566e) obj).f20850e, c17320e.f33999e);
                return Boolean.TRUE;
            default:
                C10566e c10566e = (C10566e) obj;
                if (c17320e.f33999e) {
                    C11410e c11410e = c17320e.f33996e.appmetrica;
                    if (c11410e != null) {
                        List startapp = AbstractC6874e.startapp(new Object(), new C6155e(c10566e, 1));
                        C7911e c7911e = c17320e.f33996e;
                        C16911e c16911e = c7911e.license;
                        C11840e c11840e = c7911e.tapsense;
                        C0398e Signature = c16911e.Signature(startapp);
                        c11410e.ad(null, Signature);
                        c11840e.invoke(Signature);
                    } else {
                        C0398e c0398e = c17320e.f33993e;
                        String str = c0398e.ad.f20850e;
                        long j = c0398e.vip;
                        int i2 = C12347e.metrica;
                        String obj2 = AbstractC5304e.m1874super(str, (int) (j >> 32), (int) (j & 4294967295L), c10566e).toString();
                        int length = c10566e.f20850e.length() + ((int) (c17320e.f33993e.vip >> 32));
                        c17320e.f33996e.tapsense.invoke(new C0398e(AbstractC9262e.metrica(length, length), 4, obj2));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
