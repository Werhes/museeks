package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9837e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f19426e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19427e;

    public /* synthetic */ C9837e(String str, int i) {
        this.f19427e = i;
        this.f19426e = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19427e) {
            case 0:
                return new C4600e(this.f19426e, 15);
            case 1:
                return new C4600e(this.f19426e, 7);
            case 2:
                StringBuilder sb = new StringBuilder("https://vk.com/audios");
                C14027e.ad.getClass();
                sb.append(C14027e.metrica());
                sb.append("?section=");
                sb.append(this.f19426e);
                return new C4600e(sb.toString(), 7);
            default:
                return new C4600e(this.f19426e, 7);
        }
    }
}
