package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۡؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13553e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14873e f26857e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26858e;

    public /* synthetic */ C13553e(C14873e c14873e, int i) {
        this.f26858e = i;
        this.f26857e = c14873e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f26858e) {
            case 0:
                String str = ((MainArtist) obj).ad;
                if (str == null) {
                    return Unit.INSTANCE;
                }
                this.f26857e.m2514goto(new C5522e(str));
                return Unit.INSTANCE;
            default:
                Throwable th = (Throwable) obj;
                this.f26857e.f29454e.setValue(th != null ? new C10539e(th) : C9309e.ad);
                return Unit.INSTANCE;
        }
    }
}
