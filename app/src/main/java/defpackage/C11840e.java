package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11840e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7911e f23751e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23752e;

    public /* synthetic */ C11840e(C7911e c7911e, int i) {
        this.f23752e = i;
        this.f23751e = c7911e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23752e) {
            case 0:
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) obj;
                C0866e license = this.f23751e.license();
                if (license != null) {
                    license.metrica = interfaceC0043e;
                }
                return Unit.INSTANCE;
            case 1:
                C7911e c7911e = this.f23751e;
                C0576e c0576e = c7911e.pro;
                C0398e c0398e = (C0398e) obj;
                String str = c0398e.ad.f20850e;
                C10566e c10566e = c7911e.adcel;
                if (!AbstractC7890e.billing(str, c10566e != null ? c10566e.f20850e : null)) {
                    c7911e.mopub.setValue(EnumC13262e.f26311e);
                    if (((Boolean) c0576e.getValue()).booleanValue()) {
                        c0576e.setValue(Boolean.FALSE);
                    } else {
                        c7911e.remoteconfig.setValue(Boolean.FALSE);
                    }
                }
                long j = C12347e.vip;
                c7911e.purchase(j);
                c7911e.appmetrica(j);
                c7911e.signatures.invoke(c0398e);
                c7911e.vip.vip();
                return Unit.INSTANCE;
            case 2:
                this.f23751e.subscription.vip(((C10120e) obj).ad);
                return Unit.INSTANCE;
            case 3:
                return Boolean.valueOf(this.f23751e.subscription.vip(((C10120e) obj).ad));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f23751e.admob.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
