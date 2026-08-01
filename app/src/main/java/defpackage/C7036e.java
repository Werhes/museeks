package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7036e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AudioTrack f14398e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C14873e f14399e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14400e = 1;

    public /* synthetic */ C7036e(C14873e c14873e, AudioTrack audioTrack) {
        this.f14399e = c14873e;
        this.f14398e = audioTrack;
    }

    public /* synthetic */ C7036e(AudioTrack audioTrack, C14873e c14873e) {
        this.f14398e = audioTrack;
        this.f14399e = c14873e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f14400e;
        AudioTrack audioTrack = this.f14398e;
        C14873e c14873e = this.f14399e;
        switch (i) {
            case 0:
                int i2 = C3566e.f8039e;
                AbstractC0890e.license(audioTrack).signatures(c14873e.pro());
                return Unit.INSTANCE;
            default:
                C14873e.m3867continue(2, c14873e, audioTrack, false);
                return Unit.INSTANCE;
        }
    }
}
