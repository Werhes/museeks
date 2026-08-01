package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Root;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.Catalog2Text;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioStreamMix;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۚۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0546e {
    public static C1169e ad(C3675e c3675e, Catalog2Response catalog2Response) {
        List list;
        List<Catalog2Section> list2;
        Iterator it;
        LinkedHashMap linkedHashMap;
        AlbumThumb albumThumb;
        LinkedHashMap linkedHashMap2;
        String str;
        int appmetrica;
        LinkedHashMap linkedHashMap3 = c3675e.vip;
        Catalog2Root catalog2Root = catalog2Response.ad;
        c3675e.ad(catalog2Response);
        Catalog2Section catalog2Section = catalog2Response.vip;
        if (catalog2Section == null || (list = catalog2Section.license) == null) {
            if (catalog2Root != null && (list2 = catalog2Root.vip) != null) {
                for (Catalog2Section catalog2Section2 : list2) {
                    if (AbstractC7890e.billing(catalog2Section2.ad, catalog2Root.ad)) {
                        list = catalog2Section2.license;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            list = null;
        }
        if (list == null) {
            list = C13664e.f27089e;
        }
        C1169e license = AbstractC6874e.license();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Catalog2Block catalog2Block = (Catalog2Block) it2.next();
            Catalog2Layout vip = catalog2Block.getVip();
            if ((vip instanceof Catalog2Layout.AudioStreamMix) || (vip instanceof C7454e)) {
                it = it2;
                linkedHashMap = linkedHashMap3;
                List appmetrica2 = catalog2Block.appmetrica();
                LinkedHashMap linkedHashMap4 = c3675e.tapsense;
                ArrayList arrayList = new ArrayList();
                Iterator it3 = appmetrica2.iterator();
                while (it3.hasNext()) {
                    AudioStreamMix audioStreamMix = (AudioStreamMix) linkedHashMap4.get((String) it3.next());
                    if (audioStreamMix != null) {
                        arrayList.add(audioStreamMix);
                    }
                }
                license.add(new C9552e(catalog2Block.getAd(), new C15747e(AbstractC8228e.metrica(arrayList))));
            } else {
                boolean z = vip instanceof C4525e;
                String str2 = BuildConfig.FLAVOR;
                if (z || (vip instanceof C17941e)) {
                    it = it2;
                    linkedHashMap = linkedHashMap3;
                    List appmetrica3 = catalog2Block.appmetrica();
                    LinkedHashMap linkedHashMap5 = c3675e.appmetrica;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = appmetrica3.iterator();
                    while (it4.hasNext()) {
                        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) linkedHashMap5.get((String) it4.next());
                        if (customCatalogBlockItem != null) {
                            arrayList2.add(customCatalogBlockItem);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList2, 10));
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        CustomCatalogBlockItem customCatalogBlockItem2 = (CustomCatalogBlockItem) it5.next();
                        String str3 = customCatalogBlockItem2.appmetrica;
                        List list3 = customCatalogBlockItem2.metrica;
                        String metrica = list3 != null ? AbstractC8769e.metrica(300, list3) : null;
                        if (metrica == null) {
                            metrica = BuildConfig.FLAVOR;
                        }
                        arrayList3.add(new C0262e(str3, new C4341e(metrica, customCatalogBlockItem2.ad, customCatalogBlockItem2.vip, new C2764e(customCatalogBlockItem2.license))));
                    }
                    license.add(new C9552e(catalog2Block.getAd(), new C12866e(AbstractC8228e.metrica(arrayList3))));
                } else {
                    if (vip instanceof C1693e) {
                        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                            List appmetrica4 = ((Catalog2Block.MusicPlaylistsBlock) catalog2Block).appmetrica();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it6 = appmetrica4.iterator();
                            while (it6.hasNext()) {
                                AudioPlaylist audioPlaylist = (AudioPlaylist) linkedHashMap3.get((String) it6.next());
                                if (audioPlaylist != null) {
                                    arrayList4.add(audioPlaylist);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(AbstractC0746e.subscription(arrayList4, 10));
                            Iterator it7 = arrayList4.iterator();
                            while (it7.hasNext()) {
                                AudioPlaylist audioPlaylist2 = (AudioPlaylist) it7.next();
                                String remoteconfig = AbstractC13406e.remoteconfig(audioPlaylist2);
                                AlbumThumb albumThumb2 = audioPlaylist2.f36500abstract;
                                String str4 = albumThumb2 != null ? albumThumb2.metrica : null;
                                if (str4 == null) {
                                    str4 = BuildConfig.FLAVOR;
                                }
                                arrayList5.add(new C0262e(remoteconfig, new C1545e(str4, audioPlaylist2.subs)));
                            }
                            license.add(new C9552e(catalog2Block.getAd(), new C10070e(AbstractC8228e.metrica(arrayList5))));
                        }
                    } else if ((vip instanceof C10287e) || (vip instanceof C9277e)) {
                        it = it2;
                        linkedHashMap = linkedHashMap3;
                        if (catalog2Block instanceof Catalog2Block.MusicAudiosBlock) {
                            List appmetrica5 = ((Catalog2Block.MusicAudiosBlock) catalog2Block).appmetrica();
                            LinkedHashMap linkedHashMap6 = c3675e.ad;
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it8 = appmetrica5.iterator();
                            while (it8.hasNext()) {
                                AudioTrack audioTrack = (AudioTrack) linkedHashMap6.get((String) it8.next());
                                if (audioTrack != null) {
                                    arrayList6.add(audioTrack);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList(AbstractC0746e.subscription(arrayList6, 10));
                            Iterator it9 = arrayList6.iterator();
                            while (it9.hasNext()) {
                                AudioTrack audioTrack2 = (AudioTrack) it9.next();
                                String purchase = AbstractC6914e.purchase(audioTrack2);
                                AudioAlbum audioAlbum = audioTrack2.amazon;
                                String str5 = (audioAlbum == null || (albumThumb = audioAlbum.appmetrica) == null) ? null : albumThumb.ad;
                                if (str5 == null) {
                                    str5 = BuildConfig.FLAVOR;
                                }
                                arrayList7.add(new C0262e(purchase, new C13314e(str5, audioTrack2.license, audioTrack2.ad)));
                            }
                            license.add(new C9552e(catalog2Block.getAd(), new C11086e(AbstractC8228e.metrica(arrayList7))));
                        }
                    } else if ((vip instanceof C1824e) || (vip instanceof C13420e) || (vip instanceof C13392e) || (vip instanceof C7226e) || (vip instanceof C15394e) || (vip instanceof C6624e) || (vip instanceof C7665e)) {
                        if (catalog2Block instanceof Catalog2Block.MusicPlaylistsBlock) {
                            List appmetrica6 = ((Catalog2Block.MusicPlaylistsBlock) catalog2Block).appmetrica();
                            ArrayList arrayList8 = new ArrayList();
                            Iterator it10 = appmetrica6.iterator();
                            while (it10.hasNext()) {
                                AudioPlaylist audioPlaylist3 = (AudioPlaylist) linkedHashMap3.get((String) it10.next());
                                if (audioPlaylist3 != null) {
                                    arrayList8.add(audioPlaylist3);
                                }
                            }
                            ArrayList arrayList9 = new ArrayList(AbstractC0746e.subscription(arrayList8, 10));
                            Iterator it11 = arrayList8.iterator();
                            while (it11.hasNext()) {
                                AudioPlaylist audioPlaylist4 = (AudioPlaylist) it11.next();
                                String remoteconfig2 = AbstractC13406e.remoteconfig(audioPlaylist4);
                                AlbumThumb albumThumb3 = audioPlaylist4.f36500abstract;
                                String str6 = albumThumb3 != null ? albumThumb3.metrica : null;
                                if (str6 == null) {
                                    str6 = str2;
                                }
                                String str7 = audioPlaylist4.subs;
                                Iterator it12 = it2;
                                if (AbstractC7890e.billing(vip, C1824e.ad)) {
                                    linkedHashMap2 = linkedHashMap3;
                                    str = str2;
                                } else {
                                    MainArtist billing = AbstractC13406e.billing(audioPlaylist4);
                                    if (billing == null || (str = billing.metrica) == null) {
                                        linkedHashMap2 = linkedHashMap3;
                                        str = String.valueOf(audioPlaylist4.applovin);
                                    } else {
                                        linkedHashMap2 = linkedHashMap3;
                                    }
                                }
                                String str8 = albumThumb3 != null ? albumThumb3.metrica : null;
                                String str9 = str8 == null ? str2 : str8;
                                String str10 = audioPlaylist4.f36510import;
                                if (str10 == null) {
                                    str10 = str2;
                                }
                                String m1852case = AbstractC5304e.m1852case(str10, "#");
                                if (m1852case.length() == 0) {
                                    m1852case = "000000";
                                }
                                int[] iArr = AbstractC12368e.ad;
                                C5475e c5475e = C5475e.metrica;
                                Catalog2Layout catalog2Layout = vip;
                                int length = m1852case.length();
                                Iterator it13 = it11;
                                String str11 = str2;
                                AbstractC17140e.metrica(0, length, m1852case.length());
                                if (c5475e.vip.ad) {
                                    AbstractC12368e.vip(0, length, m1852case);
                                    appmetrica = AbstractC12368e.appmetrica(length, m1852case);
                                } else {
                                    if (length <= 0) {
                                        throw new NumberFormatException(AbstractC17861e.Signature("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", m1852case.substring(0, length)));
                                    }
                                    AbstractC12368e.vip(0, length, m1852case);
                                    appmetrica = AbstractC12368e.appmetrica(length, m1852case);
                                }
                                arrayList9.add(new C0262e(remoteconfig2, new C16641e(str6, str7, str, new C13796e(appmetrica, audioPlaylist4.isPro, audioPlaylist4.applovin, str9, audioPlaylist4.f36509implements, audioPlaylist4.subs))));
                                it2 = it12;
                                linkedHashMap3 = linkedHashMap2;
                                vip = catalog2Layout;
                                it11 = it13;
                                str2 = str11;
                            }
                            it = it2;
                            linkedHashMap = linkedHashMap3;
                            license.add(new C9552e(catalog2Block.getAd(), new C10070e(AbstractC8228e.metrica(arrayList9))));
                        }
                    } else if (AbstractC7890e.billing(vip, C5198e.ad) || (vip instanceof Catalog2Layout.Separator)) {
                        license.add(new C9552e(catalog2Block.getAd(), C16880e.ad));
                    } else if (vip instanceof Catalog2Layout.ExtendedHeader) {
                        String str12 = ((Catalog2Layout.ExtendedHeader) vip).ad;
                        if (str12 != null) {
                            str2 = str12;
                        }
                        license.add(new C9552e(catalog2Block.getAd(), new C14057e(str2)));
                    } else if (vip instanceof Catalog2Layout.Header) {
                        String str13 = ((Catalog2Layout.Header) vip).ad;
                        if (str13 != null) {
                            str2 = str13;
                        }
                        license.add(new C9552e(catalog2Block.getAd(), new C14057e(str2)));
                    } else if (vip instanceof Catalog2Layout.CompactHeader) {
                        String str14 = ((Catalog2Layout.CompactHeader) vip).ad;
                        if (str14 != null) {
                            str2 = str14;
                        }
                        license.add(new C9552e(catalog2Block.getAd(), new C14057e(str2)));
                    } else if (vip instanceof Catalog2Layout.HorizontalButtons) {
                        Unit unit = Unit.INSTANCE;
                    } else if (AbstractC7890e.billing(vip, C13707e.ad) || AbstractC7890e.billing(vip, C7553e.ad) || AbstractC7890e.billing(vip, C12971e.ad) || AbstractC7890e.billing(vip, C15835e.ad) || AbstractC7890e.billing(vip, C17993e.ad) || AbstractC7890e.billing(vip, C4150e.ad) || AbstractC7890e.billing(vip, C17591e.ad) || AbstractC7890e.billing(vip, C10113e.ad)) {
                        Unit unit2 = Unit.INSTANCE;
                    } else if (AbstractC7890e.billing(vip, C11375e.ad)) {
                        List appmetrica7 = catalog2Block.appmetrica();
                        LinkedHashMap linkedHashMap7 = c3675e.mopub;
                        ArrayList arrayList10 = new ArrayList();
                        Iterator it14 = appmetrica7.iterator();
                        while (it14.hasNext()) {
                            Catalog2Text catalog2Text = (Catalog2Text) linkedHashMap7.get((String) it14.next());
                            if (catalog2Text != null) {
                                arrayList10.add(catalog2Text);
                            }
                        }
                        ArrayList arrayList11 = new ArrayList(AbstractC0746e.subscription(arrayList10, 10));
                        Iterator it15 = arrayList10.iterator();
                        while (it15.hasNext()) {
                            license.add(new C9552e(catalog2Block.getAd(), new C16119e(((Catalog2Text) it15.next()).vip)));
                            arrayList11.add(Boolean.TRUE);
                        }
                    } else if (AbstractC7890e.billing(vip, C6624e.ad) || AbstractC7890e.billing(vip, C17095e.ad) || AbstractC7890e.billing(vip, C6910e.ad) || AbstractC7890e.billing(vip, C11121e.ad) || AbstractC7890e.billing(vip, C0356e.ad) || (vip instanceof Catalog2Layout.SubsectionTabs) || (vip instanceof Catalog2Layout.SynthOpenCacheSearch) || (vip instanceof Catalog2Layout.MusicNewsfeedTitle) || AbstractC7890e.billing(vip, C11967e.ad)) {
                        Unit unit3 = Unit.INSTANCE;
                    } else {
                        AbstractC7890e.billing(vip, C7510e.ad);
                    }
                    it = it2;
                    linkedHashMap = linkedHashMap3;
                }
            }
            it2 = it;
            linkedHashMap3 = linkedHashMap;
        }
        return AbstractC6874e.metrica(license);
    }
}
