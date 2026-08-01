package defpackage;

import android.net.ConnectivityManager;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4877e extends AbstractC9615e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AudioTrack f10347e;

    public C4877e(AudioTrack audioTrack) {
        super(R.string.content_blocked_audio, 2);
        this.f10347e = audioTrack;
    }

    @Override // defpackage.AbstractC9615e
    public final List mopub() {
        File file = AbstractC14119e.ad;
        if (AbstractC14119e.vip(this.f10347e) != 3) {
            final int i = 0;
            return Collections.singletonList(new C7981e(R.string.content_blocked_actions_unlock_artist, R.drawable.ic_block_outline_28, new Function1(this) { // from class: eؚٕۥ

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C4877e f14677e;

                {
                    this.f14677e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i2 = i;
                    C4877e c4877e = this.f14677e;
                    AppActivity appActivity = (AppActivity) obj;
                    switch (i2) {
                        case 0:
                            File file2 = AbstractC14119e.ad;
                            AudioTrack audioTrack = c4877e.f10347e;
                            int m2467class = AbstractC8703e.m2467class(AbstractC14119e.vip(audioTrack));
                            if (m2467class == 0) {
                                C18046e ad = AbstractC1831e.ad();
                                VKXApplication vKXApplication = VKXApplication.f36528e;
                                if (vKXApplication == null) {
                                    vKXApplication = null;
                                }
                                AbstractC7754e.license(ad, vKXApplication, new C10739e(5, appActivity));
                            } else if (m2467class == 1) {
                                for (MainArtist mainArtist : AbstractC6914e.vip(audioTrack)) {
                                    File file3 = AbstractC14119e.ad;
                                    String str = mainArtist.ad;
                                    if (str == null) {
                                        str = BuildConfig.FLAVOR;
                                    }
                                    AbstractC14119e.vip.remove(str);
                                    AbstractC14119e.metrica();
                                }
                            } else if (m2467class != 2) {
                                throw new C14803e(10);
                            }
                            return Unit.INSTANCE;
                        default:
                            appActivity.isVip(new C14850e(c4877e.f10347e.ad + ' ' + c4877e.f10347e.license));
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        C1169e license = AbstractC6874e.license();
        final int i2 = 1;
        license.add(new C7981e(R.string.content_blocked_actions_find_track, R.drawable.ic_search_outline_28, new Function1(this) { // from class: eؚٕۥ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4877e f14677e;

            {
                this.f14677e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                C4877e c4877e = this.f14677e;
                AppActivity appActivity = (AppActivity) obj;
                switch (i22) {
                    case 0:
                        File file2 = AbstractC14119e.ad;
                        AudioTrack audioTrack = c4877e.f10347e;
                        int m2467class = AbstractC8703e.m2467class(AbstractC14119e.vip(audioTrack));
                        if (m2467class == 0) {
                            C18046e ad = AbstractC1831e.ad();
                            VKXApplication vKXApplication = VKXApplication.f36528e;
                            if (vKXApplication == null) {
                                vKXApplication = null;
                            }
                            AbstractC7754e.license(ad, vKXApplication, new C10739e(5, appActivity));
                        } else if (m2467class == 1) {
                            for (MainArtist mainArtist : AbstractC6914e.vip(audioTrack)) {
                                File file3 = AbstractC14119e.ad;
                                String str = mainArtist.ad;
                                if (str == null) {
                                    str = BuildConfig.FLAVOR;
                                }
                                AbstractC14119e.vip.remove(str);
                                AbstractC14119e.metrica();
                            }
                        } else if (m2467class != 2) {
                            throw new C14803e(10);
                        }
                        return Unit.INSTANCE;
                    default:
                        appActivity.isVip(new C14850e(c4877e.f10347e.ad + ' ' + c4877e.f10347e.license));
                        return Unit.INSTANCE;
                }
            }
        }));
        return AbstractC6874e.metrica(license);
    }

    @Override // defpackage.AbstractC9615e
    public final String smaato() {
        File file = AbstractC14119e.ad;
        AudioTrack audioTrack = this.f10347e;
        if (AbstractC14119e.vip(audioTrack) != 3) {
            VKXApplication vKXApplication = VKXApplication.f36528e;
            return (vKXApplication != null ? vKXApplication : null).getString(R.string.content_blocked_manual);
        }
        int i = audioTrack.smaato;
        switch (i) {
            case -1:
                return "[VKX] Custom Filter";
            case 0:
                return "Трек не был заблокирован со стороны ВК, однако ссылка на него пуста. Возможно, на стороне ВК сейчас проблемы - попробуйте обновить страницу через некоторое время.";
            case 1:
                return "Трек был изъят из ВК правобладателем. Оригинальный трек больше недоступен - ищите перезалив.";
            case 2:
                ConnectivityManager connectivityManager = VKXApplication.f36537e;
                return AbstractC17305e.m4289native(connectivityManager != null ? connectivityManager : null) ? "Трек заблокирован по геолокации. VK X обнаружил, что у вас включен VPN или частный DNS: смените регион в нем на одну из стран СНГ, выключите его или оформите подписку \"VK Музыка\"." : "Трек заблокирован по геолокации. Включите VPN, если хотите прослушивать музыку без подписки \"VK Музыка\".";
            case 3:
                return "Данный трек доступен только по подписке \"VK Музыка\", которая не связяна с VK X. Это серверное ограничение.";
            case 4:
                return "Требуется замена";
            case 5:
                return "Трек еще не опубликован.";
            case 6:
                return "Вы находитесь вне стран СНГ. Включите VPN, если хотите прослушивать музыку без подписки \"VK Музыка\".";
            case 7:
                return "Трек был удален из-за нарушений правил платформы ВК или по запросу Роскомнадзора.";
            case 8:
                return "Ваша подписка \"VK Музыка\" была приостановлена.";
            case 9:
                return "VK говорит, что нужно обновить приложение. Скорее всего, вам нужно обновить VK X.";
            case 10:
                return "Трек был изъят из ВК правобладателем Warner. Оригинальный трек больше недоступен - ищите перезалив.";
            case 11:
                return "Podcast Subscription Required";
            case 12:
                return "Вы выиграли в шведской лотерее";
            case 13:
                return "Ошибка на стороне сервера";
            case 14:
                return "Трек был изъят из ВК правобладателем Jam. Оригинальный трек больше недоступен - ищите перезалив.";
            default:
                switch (i) {
                    case 21:
                        return "Story Unavailable";
                    case 22:
                        return "Story Free";
                    case 23:
                        return "Story Paid";
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        return "Детский режим: скорее всего, требуется отдельная подписка от самого ВК, которая еще не была запущена на момент написания данного текста";
                    default:
                        return AbstractC1786e.admob(i, "Unknown: ");
                }
        }
    }
}
