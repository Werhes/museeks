package defpackage;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٛۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13372e implements InterfaceC8615e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function0 f26632e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AudioTrack f26633e;

    public C13372e(AudioTrack audioTrack, Function0 function0) {
        this.f26633e = audioTrack;
        this.f26632e = function0;
    }

    @Override // defpackage.InterfaceC8615e
    public final void Signature(Activity activity) {
        new C1208e(this.f26633e).signatures(activity);
    }

    public final void ad(C1169e c1169e, int i, int i2, Function1 function1) {
        c1169e.add(new C1490e(i, i2, false, function1));
    }

    @Override // defpackage.InterfaceC8615e
    public final List adcel() {
        C1169e license = AbstractC6874e.license();
        AudioTrack audioTrack = this.f26633e;
        AudioAlbum audioAlbum = audioTrack.amazon;
        if (audioAlbum != null) {
            license.add(new C3662e(R.drawable.ic_vinyl_outline_24, audioAlbum.license, new C15905e(this, 9)));
        }
        for (MainArtist mainArtist : AbstractC6914e.vip(audioTrack)) {
            license.add(new C3662e(R.drawable.ic_music_mic_outline_28, mainArtist.metrica, new C10989e(mainArtist, 1)));
        }
        return AbstractC6874e.metrica(license);
    }

    @Override // defpackage.InterfaceC8615e
    public final InterfaceC8346e amazon() {
        C13372e c13372e;
        C1169e license = AbstractC6874e.license();
        C11794e.f23667e.getClass();
        if (this.f26633e.isVip()) {
            c13372e = this;
            c13372e.smaato(license, R.drawable.ic_download_check_outline_28, R.string.buttonbar_pl_cached, (r15 & 4) == 0, (r15 & 8) == 0, new C2091e(0));
        } else {
            c13372e = this;
            c13372e.smaato(license, R.drawable.ic_download_outline_28, R.string.buttonbar_pl_cache, (r15 & 4) == 0, (r15 & 8) == 0, new C15905e(this, 7));
        }
        c13372e.smaato(license, R.drawable.ic_share_outline_28, R.string.share, (r15 & 4) == 0, (r15 & 8) == 0, new C15905e(this, 8));
        smaato(license, R.drawable.ic_radiowaves_left_and_right_outline_28, R.string.uma_radio_title, (r15 & 4) == 0, (r15 & 8) == 0, new C2091e(1));
        return AbstractC8228e.metrica(AbstractC6874e.metrica(license));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r8 != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r9 == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.InterfaceC8615e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(boolean r8, defpackage.AbstractC10731e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C14512e
            if (r0 == 0) goto L13
            r0 = r9
            eٔؖٚ r0 = (defpackage.C14512e) r0
            int r1 = r0.f28697e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28697e = r1
            goto L18
        L13:
            eٔؖٚ r0 = new eٔؖٚ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f28695e
            int r1 = r0.f28697e
            r2 = 0
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r3 = r7.f26633e
            r4 = 2
            r5 = 1
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2d
            defpackage.AbstractC2003e.purchase(r9)
            goto L7d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            boolean r8 = r0.f28696e
            defpackage.AbstractC2003e.purchase(r9)
            goto L5b
        L3b:
            defpackage.AbstractC2003e.purchase(r9)
            if (r8 == 0) goto L5b
            r0.f28696e = r8
            r0.f28697e = r5
            eّٕٓ r9 = defpackage.AbstractC6731e.ad
            eؕۙۜ r9 = defpackage.ExecutorC3603e.f8134e
            eؚٖٟ r1 = new eؚٖٟ
            r5 = 26
            r1.<init>(r3, r2, r5)
            java.lang.Object r9 = defpackage.AbstractC5336e.advert(r9, r1, r0)
            if (r9 != r6) goto L56
            goto L58
        L56:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
        L58:
            if (r9 != r6) goto L5b
            goto L7c
        L5b:
            r0.f28696e = r8
            r0.f28697e = r4
            r3.getClass()
            eّٕٓ r8 = defpackage.AbstractC6731e.ad
            eؕۙۜ r8 = defpackage.ExecutorC3603e.f8134e
            eٍٓٚ r9 = new eٍٓٚ
            r1 = 0
            r9.<init>(r1, r3, r2)
            java.lang.Object r8 = defpackage.AbstractC5336e.advert(r8, r9, r0)
            if (r8 != r6) goto L73
            goto L75
        L73:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L75:
            if (r8 != r6) goto L78
            goto L7a
        L78:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L7a:
            if (r8 != r6) goto L7d
        L7c:
            return r6
        L7d:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13372e.appmetrica(boolean, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC8615e
    public final C14623e inmobi() {
        AudioTrack audioTrack = this.f26633e;
        return new C14623e(audioTrack, audioTrack.license, audioTrack.ad, false);
    }

    @Override // defpackage.InterfaceC8615e
    public final InterfaceC1133e loadAd() {
        return new C15816e(29, this.f26633e);
    }

    @Override // defpackage.InterfaceC8615e
    public final Integer metrica() {
        return null;
    }

    @Override // defpackage.InterfaceC8615e
    public final Object pro(C14358e c14358e) {
        C15420e c15420e = AbstractC6731e.ad;
        Object advert = AbstractC5336e.advert(ExecutorC3603e.f8134e, new C7195e(this.f26633e, (InterfaceC5083e) null, 26), c14358e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (advert != enumC2821e) {
            advert = Unit.INSTANCE;
        }
        return advert == enumC2821e ? advert : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC8615e
    public final InterfaceC8346e purchase() {
        C6571e c6571e;
        C1169e license = AbstractC6874e.license();
        Function0 function0 = this.f26632e;
        if (function0 != null && (c6571e = (C6571e) function0.invoke()) != null) {
            EnumC13401e enumC13401e = (EnumC13401e) c6571e.f13544e;
            ad(license, enumC13401e.f26658e, enumC13401e.f26657e, new C13942e(c6571e, this, 13));
        }
        ad(license, R.drawable.ic_list_play_outline_28, R.string.action_audio_playnext, new C15905e(this, 10));
        AudioTrack audioTrack = this.f26633e;
        audioTrack.getClass();
        if (audioTrack.appmetrica() != 2) {
            ad(license, R.drawable.ic_list_add_outline_28, R.string.action_audio_addtoplaylist, new C15905e(this, 0));
            ad(license, R.drawable.ic_search_outline_28, R.string.action_audio_search, new C15905e(this, 1));
            if (audioTrack.Signature == null) {
                long j = audioTrack.metrica;
                C14027e.ad.getClass();
                if (j == C14027e.metrica() && audioTrack.amazon == null) {
                    ad(license, R.drawable.ic_edit_outline_28, R.string.edit_audio, new C15905e(this, 2));
                }
            }
            ad(license, R.drawable.ic_headphones_outline_28, R.string.action_audio_similar, new C15905e(this, 3));
            ad(license, R.drawable.speedometer_max_outline_28, R.string.track_bitrate, new C15905e(this, 4));
        }
        ad(license, R.drawable.ic_article_outline_28, R.string.action_audio_tolyrics, new C15905e(this, 5));
        ad(license, R.drawable.ic_download_cloud_outline_28, R.string.action_audio_dl, new C15905e(this, 6));
        return AbstractC8228e.metrica(AbstractC6874e.metrica(license));
    }

    @Override // defpackage.InterfaceC8615e
    public final void remoteconfig(C3566e c3566e) {
        AudioTrack audioTrack = this.f26633e;
        if (audioTrack.getPurchase()) {
            c3566e.m1377this(EnumC10826e.f21458e);
            return;
        }
        AppActivity appActivity = (AppActivity) c3566e.f10582e;
        Integer valueOf = Integer.valueOf(R.drawable.ic_list_add_outline_28);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        C9402e.ad(appActivity, new C15076e(valueOf, VKXApplication.Companion.vip(R.string.sn_track_added_to_library), audioTrack.ad + " - " + audioTrack.license, new C6571e(VKXApplication.Companion.vip(R.string.sn_undo), new C8462e(4)), new C2899e(3, this), 80));
        c3566e.purchase();
    }

    @Override // defpackage.InterfaceC8615e
    public final Object signatures(C12972e c12972e) {
        C11794e.f23667e.getClass();
        return C11794e.metrica(this.f26633e, c12972e);
    }

    @Override // defpackage.InterfaceC8615e
    public final void smaato(C1169e c1169e, int i, int i2, boolean z, boolean z2, Function1 function1) {
        c1169e.add(new C1637e(i, i2, z, z2, function1));
    }

    @Override // defpackage.InterfaceC8615e
    public final boolean subscription() {
        AudioTrack audioTrack = this.f26633e;
        if (audioTrack.amazon == null) {
            List list = audioTrack.Signature;
            if (list == null || list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC8615e
    public final boolean vip() {
        return this.f26633e.getPurchase();
    }
}
