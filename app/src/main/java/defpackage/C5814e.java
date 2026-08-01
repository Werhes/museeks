package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.internal.objects.VKResponseWithItems;
import ua.itaysonlab.vkapi2.objects.music.AudioPlaylistSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5814e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f12262e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f12263e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ AudioPlaylist f12264e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ int f12265e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5814e(int i, InterfaceC5083e interfaceC5083e, AudioPlaylist audioPlaylist) {
        super(2, interfaceC5083e);
        this.f12264e = audioPlaylist;
        this.f12263e = i;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C5814e c5814e = new C5814e(this.f12263e, interfaceC5083e, this.f12264e);
        c5814e.f12265e = ((Number) obj).intValue();
        return c5814e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5814e) advert((InterfaceC5083e) obj2, Integer.valueOf(((Number) obj).intValue()))).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f12265e;
        int i2 = this.f12262e;
        if (i2 == 0) {
            AbstractC2003e.purchase(obj);
            AudioPlaylist audioPlaylist = this.f12264e;
            C11459e c11459e = new C11459e(audioPlaylist.isPro, i, this.f12263e, audioPlaylist.applovin, audioPlaylist.f36509implements);
            this.f12265e = i;
            this.f12262e = 1;
            obj = c11459e.startapp(this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        Iterable<AudioPlaylistSnippetEntry> iterable = (List) ((VKResponseWithItems) obj).ad;
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        for (AudioPlaylistSnippetEntry audioPlaylistSnippetEntry : iterable) {
            AudioTrack audioTrack = audioPlaylistSnippetEntry.ad;
            AudioPlaylistSnippetEntry.StreamUrl streamUrl = audioPlaylistSnippetEntry.vip;
            String str = null;
            String str2 = "_playlist_mix";
            String str3 = null;
            arrayList.add(new AudioSnippetEntry(str2, null, null, str3, str, AbstractC11263e.Signature().ad(), Collections.singletonList(AudioTrack.signatures(audioTrack, streamUrl.ad, null, null, null, (streamUrl.metrica - streamUrl.vip) / 1000, -67109377, 7)), Collections.singletonList(AbstractC6914e.purchase(audioPlaylistSnippetEntry.ad)), 30));
        }
        return arrayList;
    }
}
