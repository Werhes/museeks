package defpackage;

import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC14893e {
    f29511e(VKXApplication.Companion.vip(R.string.hint_artist_title), VKXApplication.Companion.vip(R.string.hint_artist_desc)),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("\"Сейчас играет\"", "Здесь вы можете получить доступ к эквалайзеру, таймеру сна и тексту песни."),
    f29515e("Меню плейлиста", "Это меню служит для скачивания или кеширования плейлиста.\n\nЕсли вы можете управлять плейлистом, вы сможете здесь его редактировать."),
    f29509e("Переключение между источниками", "Для того, чтобы переключаться между треками в ВК и треками на устройстве, достаточно задержать на любую иконку в докбаре.\n\nНажмите на подсказку, чтобы продолжить."),
    f29518e("Где находятся моя скачанная библиотека?", "Скачанная библиотека существует как отдельный плейлист.\n\nДля доступа к нему оффлайн откройте раздел \"Мои треки\" в разделе \"Загружено\".\n\nУчтите, что плейлист будет доступен только после успешного кеширования всей библиотеки!"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8("Смена метаданных трека", "Нажмите, чтобы изменить название трека или исполнителя до загрузки его на сервер."),
    f29517e(BuildConfig.FLAVOR, BuildConfig.FLAVOR),
    f29513e(BuildConfig.FLAVOR, BuildConfig.FLAVOR),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(BuildConfig.FLAVOR, BuildConfig.FLAVOR),
    f29516e(VKXApplication.Companion.vip(R.string.hint_snippets), VKXApplication.Companion.vip(R.string.hint_snippets_text)),
    f29512e(BuildConfig.FLAVOR, BuildConfig.FLAVOR),
    f29514e(BuildConfig.FLAVOR, BuildConfig.FLAVOR);


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f29519e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f29520e;

    static {
        VKXApplication.Companion companion = VKXApplication.f36531e;
    }

    EnumC14893e(String str, String str2) {
        this.f29520e = str;
        this.f29519e = str2;
    }
}
