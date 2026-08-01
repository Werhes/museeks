package defpackage;

import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2473e extends AbstractC16039e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ int f6318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2473e(AbstractServiceC5057e abstractServiceC5057e, int i) {
        super(abstractServiceC5057e);
        this.f6318e = i;
    }

    @Override // defpackage.AbstractC16039e
    public final int ad() {
        switch (this.f6318e) {
            case 0:
                return R.string.cache_ch_desc;
            default:
                return R.string.downloader_saf_channel_desc;
        }
    }

    @Override // defpackage.AbstractC16039e
    public final String billing() {
        switch (this.f6318e) {
            case 0:
                return "cache";
            default:
                return "download";
        }
    }

    @Override // defpackage.AbstractC16039e
    public final int metrica() {
        switch (this.f6318e) {
            case 0:
                return R.string.cache_ch;
            default:
                return R.string.downloader_saf_channel;
        }
    }

    @Override // defpackage.AbstractC16039e
    public final String vip() {
        switch (this.f6318e) {
            case 0:
                return "cacheChannel";
            default:
                return "downloaderChannel";
        }
    }

    @Override // defpackage.AbstractC16039e
    public final String yandex() {
        switch (this.f6318e) {
            case 0:
                return "Кеширование";
            default:
                return "Скачивание";
        }
    }
}
