package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5128e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f10992e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13345e f10993e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f10994e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f10995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5128e(int i, int i2, AbstractC13345e abstractC13345e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f10995e = i;
        this.f10994e = i2;
        this.f10993e = abstractC13345e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C5128e(this.f10995e, this.f10994e, this.f10993e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C5128e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        List list;
        List list2;
        int i = this.f10992e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            C15802e c15802e = C15802e.f31123e;
            long j = this.f10994e;
            this.f10992e = 1;
            obj = c15802e.remoteconfig(this.f10995e, j, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        Iterable<AudioTrack> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        for (AudioTrack audioTrack : iterable) {
            List list3 = audioTrack.Signature;
            AudioAlbum audioAlbum = null;
            if (list3 != null) {
                if (list3.isEmpty()) {
                    list3 = null;
                }
                list = list3;
            } else {
                list = null;
            }
            List list4 = audioTrack.admob;
            if (list4 != null) {
                if (list4.isEmpty()) {
                    list4 = null;
                }
                list2 = list4;
            } else {
                list2 = null;
            }
            AudioAlbum audioAlbum2 = audioTrack.amazon;
            if (audioAlbum2 != null) {
                audioAlbum = AudioAlbum.ad(audioAlbum2);
            }
            arrayList.add(this.f10993e.appmetrica(AudioTrack.signatures(audioTrack, null, audioAlbum, list, list2, 0, -106497, 7)));
        }
        return arrayList;
    }
}
