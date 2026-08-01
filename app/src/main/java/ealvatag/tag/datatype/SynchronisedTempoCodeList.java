package ealvatag.tag.datatype;

import ealvatag.tag.id3.framebody.FrameBodySYTC;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class SynchronisedTempoCodeList extends AbstractDataTypeList<SynchronisedTempoCode> {
    public SynchronisedTempoCodeList(SynchronisedTempoCodeList synchronisedTempoCodeList) {
        super(synchronisedTempoCodeList);
    }

    public SynchronisedTempoCodeList(FrameBodySYTC frameBodySYTC) {
        super(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST, frameBodySYTC);
    }

    @Override // ealvatag.tag.datatype.AbstractDataTypeList
    public SynchronisedTempoCode createListElement() {
        return new SynchronisedTempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO, this.frameBody);
    }
}
