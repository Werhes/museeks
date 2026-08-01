package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15689e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int[] f30901e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC12260e f30902e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30903e;

    public /* synthetic */ C15689e(AbstractC12260e abstractC12260e, int[] iArr, int i) {
        this.f30903e = i;
        this.f30902e = abstractC12260e;
        this.f30901e = iArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C15470e c15470e = (C15470e) obj;
        switch (this.f30903e) {
            case 0:
                C10933e remoteconfig = C16021e.remoteconfig();
                String canonicalName = this.f30902e.getClass().getCanonicalName();
                remoteconfig.metrica();
                C16021e.amazon((C16021e) remoteconfig.f24447e, canonicalName);
                List m667default = AbstractC1660e.m667default(this.f30901e);
                remoteconfig.metrica();
                C16021e.loadAd((C16021e) remoteconfig.f24447e, m667default);
                C16021e c16021e = (C16021e) remoteconfig.ad();
                c15470e.metrica();
                C5801e.Signature((C5801e) c15470e.f24447e, c16021e);
                return Unit.INSTANCE;
            default:
                C6733e remoteconfig2 = C15774e.remoteconfig();
                String canonicalName2 = this.f30902e.getClass().getCanonicalName();
                remoteconfig2.metrica();
                C15774e.amazon((C15774e) remoteconfig2.f24447e, canonicalName2);
                List m667default2 = AbstractC1660e.m667default(this.f30901e);
                remoteconfig2.metrica();
                C15774e.loadAd((C15774e) remoteconfig2.f24447e, m667default2);
                C15774e c15774e = (C15774e) remoteconfig2.ad();
                c15470e.metrica();
                C5801e.amazon((C5801e) c15470e.f24447e, c15774e);
                return Unit.INSTANCE;
        }
    }
}
