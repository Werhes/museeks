package defpackage;

import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkapi2.objects.newsfeed.NewsfeedItem;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0134e extends AbstractC18406e {
    public final String billing;
    public final /* synthetic */ int purchase;
    public final String yandex;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134e(int i, long j, int i2) {
        super(AbstractC18453e.purchase(List.class, NewsfeedItem.class));
        this.purchase = 5;
        this.billing = "wall";
        this.yandex = "get";
        smaato(Integer.valueOf(i), "count");
        smaato(1, "extended");
        Signature("owner_id", Long.valueOf(j));
        smaato(Integer.valueOf(i2), "offset");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134e(long j, String str) {
        super(Integer.TYPE);
        this.purchase = 2;
        this.billing = "messages";
        this.yandex = "send";
        amazon("peer_id", String.valueOf(j));
        amazon("attachment", str);
        smaato(Integer.valueOf(str.hashCode()), "random_id");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134e(EnumC12651e enumC12651e) {
        super(Unit.class);
        this.purchase = 3;
        this.billing = "account";
        this.yandex = "setPrivacy";
        amazon("key", "audios");
        amazon("value", enumC12651e.f25375e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134e(String str, int i, int i2) {
        super(AbstractC18453e.purchase(List.class, VKProfile.class));
        this.purchase = i2;
        switch (i2) {
            case 1:
                super(AbstractC18453e.purchase(List.class, VKProfile.class));
                this.billing = "groups";
                this.yandex = "search";
                smaato(1, "extended");
                smaato(Integer.valueOf(i), "offset");
                smaato(40, "count");
                amazon("q", str);
                return;
            default:
                this.billing = "friends";
                this.yandex = "search";
                amazon("fields", "photo_100");
                amazon("order", "name");
                smaato(Integer.valueOf(i), "offset");
                smaato(40, "count");
                amazon("q", str);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0134e(String str, String str2) {
        super(AlbumThumb.class);
        this.purchase = 4;
        this.billing = "audio";
        this.yandex = "setPlaylistCoverPhoto";
        amazon("photo", str);
        amazon("hash", str2);
    }

    @Override // defpackage.AbstractC18406e
    public final String adcel() {
        switch (this.purchase) {
            case 0:
                return this.billing;
            case 1:
                return this.billing;
            case 2:
                return this.billing;
            case 3:
                return this.billing;
            case 4:
                return this.billing;
            default:
                return this.billing;
        }
    }

    @Override // defpackage.AbstractC18406e
    public final String mopub() {
        switch (this.purchase) {
            case 0:
                return this.yandex;
            case 1:
                return this.yandex;
            case 2:
                return this.yandex;
            case 3:
                return this.yandex;
            case 4:
                return this.yandex;
            default:
                return this.yandex;
        }
    }
}
